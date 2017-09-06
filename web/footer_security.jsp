<%-- 
    Document   : security
    Created on : 06.09.2017, 09:20:45
    Author     : rhemmerling
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
Login As: 
<c:url value="/FrontController4/login?username=user" var="link"/>
<a href="${link}">user</a> | 
<c:url value="/FrontController4/login?username=manager" var="link"/>
<a href="${link}">manager</a> | 
<c:url value="/FrontController4/login?username=admin" var="link"/>
<a href="${link}">admin</a> | 

<c:url value="/FrontController4/logout" var="link"/>
<a href="${link}">Logout</a> <br/><br/>

<table border="1">
  <tr>
    <td>Http Method</td>
    <td>${pageContext.request.method}</td>
  </tr>
  <tr>
    <td>User Name</td>
    <td>
      ${pageContext.request.userPrincipal.name} 
    </td>
  </tr>
  <tr>
    <td>User Roles</td>
    <td>
      ${pageContext.request.isUserInRole('ADMIN') ? "ADMIN": ""} 
      ${pageContext.request.isUserInRole('MANAGER') ? "MANAGER": ""} 
      ${pageContext.request.isUserInRole('USER') ? "USER": ""} 
    </td>
  </tr>
  <tr>
    <td>Authentication Method</td>
    <td>${pageContext.request.authType}</td>
  </tr>
</table>
