<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - Post</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/WEB-INF/views/css/main.css"%></style>
</head>

<body>
<%@include file="/WEB-INF/views/template/header.jsp"%>
    <main>
<%@include file="/WEB-INF/views/template/menu.jsp"%>

        <div class="rightBar"></div>


<div class="middleSection">

	<div align="center">
		<form:form action="createPost" method="post" modelAttribute="post">
			<table>
				<tr>
					<td>Title:</td>
					<td><form:input path="title" /></td>
				</tr>

				<tr>
					<td>Body:</td>
					<td><form:textarea path="postBody" /></td>
				</tr>
				<form:hidden path="author.id" value="${sessionScope.UserEntity.id}"/>
	
				<tr>
					<td colspan="2"><input type="submit" value="Post"></td>
				</tr>
			</table>

		</form:form>
	</div>
	</div>
	</main>
</body>
<%
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%>
</html>
