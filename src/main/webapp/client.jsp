<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <h1>Welcome to the Client page</h1>
        <h3>Please Login to make your complaint heard and resolved... </h3>
        
        <form action="client" method="POST">
            Username <input type="text" name="user" />
            Password <input type="password" name="pass" />
            <br /><br />
            <button>Login</button>
        </form>
    </body>
</html>
