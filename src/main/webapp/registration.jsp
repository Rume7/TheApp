<%-- 
    Document   : registration
    Created on : May 8, 2021, 11:59:05 PM
    Author     : Rhume
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        
        <!-- Registration page for users and managers. -->
        <form action="RegistrationControl" method="Post">
            
            <input type="email" name="email_address" placeholder="Email Address" required="true" /><br /><br />
            <input type="password" name="password" placeholder="Password" required="true" /><br /><br />
            <input type="password" name="confirmPassword" placeholder="confirmPassword" required="true" /><br /><br />
            <input type="firstName" name="firstName" placeholder="First Name" required="true" /><br /><br />
            <input type="lastName" name="lastName" placeholder="Last Name" required="true" /><br />
            <input type="text" name="phoneNumber" placeholder="Phone Number" required="true" /><br /><br />
            <input type="submit" name="Submit" />
        </form>
        
    </body>
</html>
