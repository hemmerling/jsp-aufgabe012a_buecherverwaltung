<%--
    Document   : login
    Created on : 06.09.2017, 07:58:23
    Author     : rhemmerling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login [Web Components ( aufgabe12a_buchverwaltung )]</title>
    </head>
    <body>
        <jsp:include page = "header4.jsp"/>
        <h1>Login</h1>
        <form action="j_security_check" method="POST">
            Username
            <input type="text" name="j_username" value="admin" id="j_username" />
            Password
            <input type="password" name="j_password" value="admin" />
            <input type="submit" value="Login" />
        </form>
        <jsp:include page = "footer4.jsp" />
    </body>
</html>
