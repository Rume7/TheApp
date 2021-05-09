<%-- 
    Document   : forgotPassword
    Created on : May 9, 2021, 12:29:09 PM
    Author     : E238958
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Password Page</title>
    </head>
    <body>

        <!-- Login page for users and managers -->
        <form action="LoginControl" method="Post">            
            <input type="email" name="email_address" placeholder="Email Address" required="true" /><br /><br />
            <input type="password" name="password" placeholder="New Password" required="true" /><br /><br />
            <input type="submit" name="Submit" /><br />
        </form>

    </body>
</html>
