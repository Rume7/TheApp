package com.codehacks.login.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rhume
 */
@Entity(name="LoginUser")
public class Login implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="Email_Address")
    private String emailAddress;
    
    @Column(name="User_ID")
    private String userID;
    
    @Column(name="Password")
    private String password;

    public Login() {}

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.emailAddress);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        return Objects.equals(this.emailAddress, other.emailAddress);
    }

    @Override
    public String toString() {
        return "Login = " + this.getEmailAddress();
    }    
}
