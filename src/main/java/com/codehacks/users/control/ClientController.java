package com.codehacks.users.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "Client", urlPatterns = {"/client"})
public class ClientController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userPath = request.getServletPath();
        
        String url = "index.jsp";
        if (userPath.equals("/client")) 
        {
            String username = request.getParameter("user");
            String password = request.getParameter("pass");
            
            if (username.equals("wale") && password.equals("welcome")) 
            {
               userPath = "/ClientView";
               url = "/WEB-INF/views" + userPath + ".jsp";
               request.getRequestDispatcher(url).forward(request, response);
            } else {
                request.getRequestDispatcher(url).forward(request, response);
            }
        }
    }
}
