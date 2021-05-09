<%-- 
    Document   : login
    Created on : May 8, 2021, 11:58:44 PM
    Author     : Rhume
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <!-- Login page for users and managers -->
        <form action="LoginControl" method="Post">            
            <input type="email" name="email_address" placeholder="Email Address" required="true" />
            <input type="password" name="password" placeholder="Password" required="true" />
            <input type="submit" name="Submit" />
        </form>
        
    </body>
</html>
