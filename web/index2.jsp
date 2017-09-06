<%-- 
    Document   : index
    Created on : 09.08.2017, 11:14:06
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
        <title>Startseite [Web Components ( aufgabe12a_buchverwaltung )]</title>
    </head>
    <body>
        <jsp:include page = "/header2.jsp"/>
        <h1>Web Components ( aufgabe12a_buchverwaltung ) ohne Login - Startseite</h1>
        <jsp:include page = "/footer.jsp" />
    </body>
</html>