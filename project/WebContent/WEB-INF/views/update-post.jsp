<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Post Update</title>
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
				<form:hidden path="author" value="${requestScope.editedpost.author}"/>

				<tr>
					<td colspan="2"><input type="submit" value="Update"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>