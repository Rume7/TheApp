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
            
            <input type="email" name="email_address" placeholder="Email Address" required="true" />
            <input type="password" name="password" placeholder="Password" required="true" />
            <input type="firstName" name="firstName" placeholder="First Name" required="true" />
            <input type="lastName" name="lastName" placeholder="Last Name" required="true" />
            
            <input type="submit" name="Submit" />
        </form>
        
    </body>
</html>