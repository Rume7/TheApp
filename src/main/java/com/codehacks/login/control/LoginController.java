package com.codehacks.login.control;

import com.codehacks.login.entity.Login;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rhume
 */
@WebServlet(name = "controller", urlPatterns = {"/controller"})
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        RequestDispatcher dispatcher;

        String emailAddress = request.getParameter("email");
        String password = request.getParameter("password");

        Login login = new Login();
        login.setEmailAddress(emailAddress);
        login.setPassword(password);

        // Confirm if user exist in the database
        //LoginAuthenticator authenticator = new LoginAuthenticator();
        //boolean state = authenticator.authenticate(login);       
        //System.out.println(state);
        // If yes, direct to the complaint page
        if (true) {
            dispatcher = request.getRequestDispatcher("/complainer.jsp");
            dispatcher.forward(request, response);

            //dispatcher = getServletContext().getRequestDispatcher("/complainer.jsp");
            //dispatcher.forward(request, response);
            
            //response.sendRedirect(request.getContextPath() + "/complainer.jsp");
        }

        // else, redirect to the login page
        dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
        //response.sendRedirect(request.getContextPath() + "/login");
        //response.sendRedirect("/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Login control";
    }
}
