<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>User Profile</title>
</head>
<body>
<%@include file='/WEB-INF/views/template/menu.jsp'%>
<%
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%>
id: <c:out value="${sessionScope.UserEntity.id}"/><br>
Name: <c:out value="${sessionScope.UserEntity.name}"/><br>
Username: <c:out value="${sessionScope.UserEntity.username}"/>
</body>
</html>