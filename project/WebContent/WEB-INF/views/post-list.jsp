<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - Post List</title>
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
		Post List
		<table border="1">
			<tr>
				<th>title</th>
				<th>body</th>
				<th>author</th>
			</tr>

			<c:forEach var="post" items="${postList}">
				<tr>
					<td><c:out value="${post.title}"></c:out></td>
					<td><c:out value="${post.postBody}"></c:out></td>
					<td><c:out value="${post.author}"></c:out></td>
					<td><a href="editpost?postId=${post.id}">update
							me!</a></td>
					<td><a href="deletepost?postId=${post.id}">delete
							me</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
	</div>

</body>
<%
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%>
</html>