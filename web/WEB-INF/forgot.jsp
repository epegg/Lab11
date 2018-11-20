<%-- 
    Document   : forgot
    Created on : Nov 15, 2018, 12:41:21 PM
    Author     : 752814
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <form action="forgot" method="post">
            <h1>Forgot Password</h1>
            <p>Please enter your email address to recover your password</p>
            Email Address: <input type="email" name="email" value="${email}"/>
            <input type="submit" value="Submit"/>
        </form>
            ${message}
    </body>
</html>
