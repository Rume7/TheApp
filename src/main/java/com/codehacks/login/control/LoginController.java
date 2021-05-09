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
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String emailAddress = request.getParameter("email");
        String password = request.getParameter("password");

        Login login = new Login();
        login.setEmailAddress(emailAddress);
        login.setPassword(password);

        // Confirm if user exist in the database
        LoginAuthenticator authenticator = new LoginAuthenticator();
        boolean state = authenticator.authenticate(login);

        RequestDispatcher dispatcher;

        // If yes, direct to the complaint page
        if (state) {
            dispatcher = request.getRequestDispatcher("/complainer.jsp");
            dispatcher.forward(request, response);
        }

        // else, redirect to the login page
        dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);        
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
