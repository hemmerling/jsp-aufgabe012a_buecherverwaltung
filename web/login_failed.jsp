<%-- 
    Document   : login_failed
    Created on : 06.09.2017, 10:31:11
    Author     : rhemmerling
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login erfolglos [Web Components ( aufgabe12a_buchverwaltung )]</title>
    </head>
    <body>
         <jsp:include page = "header4.jsp"/>
         <h1>Login erfolglos</h1>
        <jsp:include page = "footer4.jsp" />
    </body>
</html>
