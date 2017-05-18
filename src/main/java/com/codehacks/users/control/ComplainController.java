package com.codehacks.users.control;

import com.codehacks.users.entity.Client;
import com.codehacks.users.entity.Complain;
import com.codehacks.users.sessions.ClientFacade;
import com.codehacks.users.sessions.ComplainFacade;
import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ComplainController", urlPatterns = {"/complain"})
public class ComplainController extends HttpServlet {
    
    @EJB
    ComplainFacade complainFacade;
    
    @EJB
    ClientFacade clientFacade;

    private void processingComplaints(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String userPath = request.getServletPath();

        String url = "ClientView.jsp";
        if (userPath.equals("/complain")) {
            String clientComplain = request.getParameter("comments");
            String clientEmail = request.getParameter("email_address");
            String clientID= request.getParameter("clientId");
            
            if (clientComplain.length() > 0) {
                Complain complain = new Complain();
                complain.setClientComplain(clientComplain);
                complain.setDateOfCreation(new Date());
                complain.setComplainStatus("Unresolved");
                
                // Creating the client object
                Client client = new Client();
                client.setId(Long.parseLong(clientID));
                client.setEmail(clientEmail);
                client.setMessage(clientComplain);
                
                // push to database
                clientFacade.create(client);
                complainFacade.create(complain);
                
                url = "success.jsp";
                request.getRequestDispatcher(url).forward(request, response);
            } else {
                request.getRequestDispatcher(url).forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processingComplaints(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
