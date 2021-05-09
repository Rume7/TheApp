package com.codehacks.login.control;

import com.codehacks.login.boundary.LoginFacade;
import com.codehacks.login.entity.Login;
import javax.ejb.EJB;

/**
 *
 * @author Rhume
 */
public class LoginAuthenticator {
    
    @EJB
    private LoginFacade loginFacade;
    
    public LoginAuthenticator() {}
    
    public boolean authenticate(Login login) {
        // Use LoginFacade find method to get 
        // Get Login details from database using email as key
        // Confirm if the email is same as that from entered
        // if yes, return true;
       
        Login user = loginFacade.find(login.getEmailAddress());
        return login.getPassword().equals(user.getPassword());           
    }
    
    @Override
    public String toString(){
        return "Logger verify";
    }
    
}
