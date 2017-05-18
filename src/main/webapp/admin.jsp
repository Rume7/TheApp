<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to the Administration page</h1>
        
        <form action="administrator" method="POST">
            Username <input type="text" name="adminUser" />
            Password <input type="password" name="adminPass" />
            <br /><br />
            <button>Login</button>
        </form>
    </body>
</html>
