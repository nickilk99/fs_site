<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.ilkic.site.model.PostEntity"%>

<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Ilkic.com - Post List</title>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
<%@ include file="/WEB-INF/views/css/main.css" %>
</style>
</head>

<body>
	<%@include file="/WEB-INF/views/template/header.jsp"%>
	<main>
		<%@include file="/WEB-INF/views/template/menu.jsp"%>

		<div class="rightBar"></div>


		<div class="middleSection">
			<div align="center">


				<h2>Latest Posts</h2>


				<c:forEach var="post" items="${postList}">

					<div class="postBox">
						<h4>
							<c:out value="${post.title}"></c:out>
						</h4>
						<hr>

						<p class="postBody">
							<c:out value="${post.postBody}"></c:out>
						</p>
						<hr>
						<p class="postAuthorDate">
							Posted By <strong><c:out value="${post.author.name}"></c:out></strong>
							on <strong><c:out value="${post.createDate}"></c:out></strong>
						</p>
						<p>
							<a href="posts/${post.id}">permalink</a>
							<c:if test="${post.author.id==sessionScope.UserEntity.id}"> | <a
									href="editpost?postId=${post.id}">update</a> | <a
									href="deletepost?postId=${post.id}">delete</a>
							</c:if>
						</p>
					</div>









				</c:forEach>









				</table>
			</div>
		</div>
	</main>
</body>
<%
	String user = null;
	if (session.getAttribute("UserEntity") == null) {
		response.sendRedirect("login.html");
	}
%>
</html>