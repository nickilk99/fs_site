<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ilkic.com - Post</title>
</head>
<body>
<%@include file='/WEB-INF/views/template/menu.jsp'%>

	<div align="center">
		<form:form action="createPost" method="post" modelAttribute="post">
			<table>
				<tr>
					<td>Title</td>
					<td><form:input path="title" /></td>
				</tr>

				<tr>
					<td>Test</td>
					<td><form:textarea path="postBody" /></td>
				</tr>
				
	
  					<form:hidden path="author" value="${sessionScope.UserEntity.id}"/>
				<tr>
					<td colspan="2"><input type="submit" value="Login"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>
