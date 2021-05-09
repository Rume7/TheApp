package com.codehacks.register.control;

import com.codehacks.register.entity.Registration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rhume
 */
@WebServlet(name = "RegistrationControl", urlPatterns = {"/RegistrationControl"})
public class RegistrationControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try ( PrintWriter out = response.getWriter()) {
            
            String emailAddress = request.getParameter("email");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            
            Registration register = new Registration();
            register.setEmailAddress(emailAddress);
            register.setPassword(password);
            register.setFirstName(firstName);
            register.setLastName(lastName);
            
            // Confirm if email already exist 
            
            // if no, persist to database and redirect to login page
            
            // if yes, redirect to registration.jsp page
            
            
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
