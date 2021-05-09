package com.codehacks.register.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rhume
 */
@Entity
public class Registration implements Serializable {
    
    @Id
    @Column
    private String emailAddress;
    
    @Column
    private String password;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;    
    
    @Column
    private String phoneNum;
    
    @Column
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date timeStamp;    
    
    @Column
    private String userID = UserIDGenerator.createUserID();
    
    public Registration() {        
    }

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public String getUserID() {
        return userID;
    }
    
    @Override
    public String toString() {
        return "User is: " + this.getUserID();
    }
}
