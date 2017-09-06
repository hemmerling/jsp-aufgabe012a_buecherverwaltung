<%--
    Document   : create
    Created on : 17.07.2017, 17:33:53
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.hemmerling.aufgabe12a_buecherverwaltung.model.persistence.*"%>
<%@page import="com.hemmerling.aufgabe12a_buecherverwaltung.model.business.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buch anlegen [Web Components ( aufgabe12a_buchverwaltung )]</title>
    </head>
    <body>
        <jsp:include page = "/header3.jsp"/>
        <h1>Buch anlegen</h1>

        <script type="text/javascript">
            function fillForm1() {
                document.getElementsByName("id")[0].value = '0';
                document.getElementsByName("title")[0].value = 'Buch f&uuml;r M&auml;nner';
                document.getElementsByName("author")[0].value = 'Joe Doe';
                document.getElementsByName("yearofrelease")[0].value = 2017;
                document.getElementsByName("isbn")[0].value = '1-84356-028-3';
                document.getElementsByName("genre")[0].value = 'sachbuch';
            }
            function fillForm2() {
                document.getElementsByName("id")[0].value = '1';
                document.getElementsByName("title")[0].value = 'Mein Frauenbuch';
                document.getElementsByName("author")[0].value = 'Mary Doe';
                document.getElementsByName("yearofrelease")[0].value = "2016";
                document.getElementsByName("isbn")[0].value = '1-84356-028-4';
                document.getElementsByName("genre")[0].value = 'sachbuch';
            }
        </script>
        <form method="post" action="${context}/FrontController3/create" name="theForm">
            <input type="hidden" name="action" value="create" />
            ID: <input type="text" name="id" value = "0" />
            Titel: <input type="text" name="title" />
            Author: <input type="text" name="author" />
            Year of Release: <input type="text" name="yearofrelease" />
            ISBN: <input type="text" name="isbn" />
            Genre: <input type="text" name="genre" />
            <input type="button" value="Ausfüllen des Formulars #1" onclick="fillForm1()"  />
            <input type="button" value="Ausfüllen des Formulars #2" onclick="fillForm2()"  />
            <input type="reset" value="Reset" />
            <input type="submit" value="Submit" />
        </form>
        <jsp:include page = "/footer.jsp" />
    </body>
</html>
