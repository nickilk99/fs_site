<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - Private</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/WEB-INF/views/css/main.css"%></style>
</head>

<body>
    <header>

    </header>
    <main>
<%@include file="/WEB-INF/views/template/menu.jsp"%>

        <div class="rightBar">3</div>


<div class="middleSection">

id: <c:out value="${sessionScope.UserEntity.id}"/><br>
Name: <c:out value="${sessionScope.UserEntity.name}"/><br>
Username: <c:out value="${sessionScope.UserEntity.username}"/>
</div>
</body>
<%
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%>
</html>