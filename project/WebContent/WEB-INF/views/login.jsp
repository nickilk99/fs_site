<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ilkic.com - Login</title>
</head>
<body>
	<div align="center">
		<form:form action="validate" method="post" modelAttribute="user">
			<table>
				<tr>
					<td>Username:</td>
					<td><form:input path="username" /></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><form:password path="password" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Login"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>
</html>