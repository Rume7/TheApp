package com.codehacks.register.control;

import com.codehacks.login.boundary.LoginFacade;
import com.codehacks.login.entity.Login;
import com.codehacks.register.boundary.RegistrationFacade;
import com.codehacks.register.entity.Registration;
import com.codehacks.utilities.PasswordHash;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
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
@WebServlet(name = "RegistrationControl", urlPatterns = {"/RegistrationControl"})
public class RegistrationControl extends HttpServlet {

    @EJB
    private LoginFacade loginFacade;

    @EJB
    private RegistrationFacade registrationFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        RequestDispatcher dispatcher;

        response.setContentType("text/html;charset=UTF-8");

        String emailAddress = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNum = request.getParameter("phoneNumber");

        if (!password.equals(confirmPassword)) {
            // Instruct users to input same password and 
            dispatcher = request.getRequestDispatcher("/registration.jsp");
            dispatcher.forward(request, response);
        } else {
            // Check if the user already exist in the database
            Registration registeredUser = registrationFacade.find(emailAddress);

            // If the user doesn't exist in the database
            if (registeredUser == null) {
                String hashedPassword = PasswordHash.getSaltedHash(password);

                Registration register = new Registration();
                Login loginUser = new Login();

                String userID = register.getUserID();
                register.setEmailAddress(emailAddress);
                register.setPassword(hashedPassword);
                register.setFirstName(firstName);
                register.setLastName(lastName);
                register.setPhoneNum(phoneNum);

                // Create login user object 
                loginUser.setUserID(userID);
                loginUser.setEmailAddress(emailAddress);
                loginUser.setPassword(hashedPassword);

                // Persist details to database.
                loginFacade.create(loginUser);
                registrationFacade.create(register);

                dispatcher = request.getRequestDispatcher("/login.jsp");
                dispatcher.forward(request, response);
            } else {
                // User is already registered
                // User should re-enter login details or choose forgot password
                dispatcher = request.getRequestDispatcher("/forgotPasswor.jsp");
                dispatcher.forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(RegistrationControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
