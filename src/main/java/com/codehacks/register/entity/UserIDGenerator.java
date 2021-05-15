package com.codehacks.register.entity;

/**
 * @author Rhume
 */
public class UserIDGenerator {
    
    private static Integer employeeNumber = 101001;
    
    private UserIDGenerator(){}
    
    public static String createUserID() {
        ++employeeNumber;
        String empNumber = "E" + employeeNumber;
        return empNumber;
    }    
}
