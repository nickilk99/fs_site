<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<body>
<%@include file='/WEB-INF/views/template/menu.jsp'%>
	<div>
		<a href="#">Link</a>
	</div>

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

</body>
</html>