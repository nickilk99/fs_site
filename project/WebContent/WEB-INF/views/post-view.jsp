<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.ilkic.site.model.PostEntity" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="/WEB-INF/views/css/main.css"%></style>
<title>Ilkic</title>
</head>
<body>
<%@include file="/WEB-INF/views/template/header.jsp"%>
    <main>
<%@include file="/WEB-INF/views/template/menu.jsp"%>

        <div class="rightBar"></div>
	
	<div class="middleSection">
		id: <c:out value="${requestScope.singlePost.id}"/><br>
		Title: <c:out value="${requestScope.singlePost.title}"/><br>
		Post: <c:out value="${requestScope.singlePost.postBody}"/><br>
		Author: <c:out value="${requestScope.singlePost.author.name}"/>
	</div>
	
		<div align="center">

		<form:form action="createComment" method="post" modelAttribute="commentform">
			<table>
				<tr>
					<td>Body:</td>
					<td><form:textarea path="commentBody" /></td>
				</tr>
				<form:hidden path="author.id" value="${sessionScope.UserEntity.id}"/>
				<form:hidden path="post.id" value="${requestScope.singlePost.id}"/>
	
				<tr>
					<td colspan="2"><input type="submit" value="Post"></td>
				</tr>
			</table>
			</form:form>
			<br><br><br>
			<div>
				<c:forEach var="comments" items="${commentList}">
		
				<div class="commentBox">
				<c:out value="${comments.createDate}"></c:out>

				<p class="commentBody"><c:out value="${comments.commentBody}"></c:out></p>

				<p class="commentBody"><c:out value="${comments.author.name}"></c:out></p>
				</div>
				
				
				
				
				
				
				
				
				
			</c:forEach>
			
			</div>

		
	</div>
	</main>
</body>
</html>





