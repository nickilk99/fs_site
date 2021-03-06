<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - Post Comment</title>
    <style><%@include file="/WEB-INF/views/css/main.css"%></style>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
<%@include file="/WEB-INF/views/template/header.jsp"%>
    <main>
<%@include file="/WEB-INF/views/template/menu.jsp"%>
        <div class="rightBar"></div>

	<div class="middleSection">
	<div align="center">
		<form:form action="updatePost" method="post" 
			modelAttribute="editedpost">
			<table>
					<form:hidden path="id" />
				
				<tr>
					<td>Title</td>
					<td><form:input path="title" /></td>
				</tr>

				<tr>
					<td>Body</td>
					<td><form:textarea cols="60" rows="10" path="postBody" /></td>
				</tr>
				<form:hidden path="author.id" value="${requestScope.editedpost.author.id}"/>

				<tr>
					<td colspan="2"><input type="submit" value="Update"></td>
				</tr>
			</table>

		</form:form>
		</div>
	</div>
	<%
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%>
</main>
</body>
</html>