<%-- 
    Document   : access_denied
    Created on : 06.09.2017, 09:17:24
    Author     : rhemmerling
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!-- java.lang.IllegalArgumentException: 
     Error page location access_denied.jsp must start with a '/'-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unberechtigter direkter Zugriff ( HTTP Status 400 )</title>
    </head>
    <body>
        <jsp:include page = "header4.jsp"/>
        <h1>Unberechtigter direkter Zugriff ( HTTP Status 400 )</h1>
        <jsp:include page = "footer4.jsp" />
    </body>
</html>
