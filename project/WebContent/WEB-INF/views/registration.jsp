<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - Register</title>
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
	<div align="center">
		<form:form action="createUser" method="post" modelAttribute="user">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td>Username:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td>Email Address:</td>
					<td><form:input path="email" /></td>
				</tr>
                <tr>
					<td><form:hidden path="isActive" value="1" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Register"></td>
				</tr>
			</table>

		</form:form>
	</div>
	</div>
</body>
</html>