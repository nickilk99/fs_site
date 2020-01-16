<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Post Update</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
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
					<td><form:textarea path="postBody" /></td>
				</tr>
				<form:hidden path="author.id" value="${requestScope.editedpost.author.id}"/>

				<tr>
					<td colspan="2"><input type="submit" value="Update"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>