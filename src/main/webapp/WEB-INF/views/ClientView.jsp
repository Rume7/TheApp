<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Page</title>
    </head>
    <body>
        
        <form action="complain" method="POST">
            <table border="0" width="10" cellspacing="5" cellpadding="1">
                <tbody>
                    <tr>
                        <td>Client Id:</td>
                        <td><input type="text" name="clientId" value="" /></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Email address:</td>
                        <td><input type="text" name="email_address" value="example@exampe.com" /></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Make Complain:</td>
                        <td><textarea name="comments" rows="10" cols="40"></textarea></td>
                        <td></td>
                    </tr>
                    <tr >
                        <td></td>
                        <td><input type="submit" value="Submit" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
