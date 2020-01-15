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
		<form:form action="updateComment" method="post" 
			modelAttribute="newComment">
			<table>
					<form:hidden path="id" />
				

				<tr>
					<td>Body</td>
					<td><form:textarea path="commentBody" /></td>
				</tr>
				<form:hidden path="author.id" value="${sessionScope.UserEntity.id}"/>
				<form:hidden path="post.id" value='<%= request.getParameter("commentId") %>'/>
				

				<tr>
					<td colspan="2"><input type="submit" value="Update"></td>
				</tr>
			</table>

		</form:form>
	</div>
	Hello <b><%= request.getParameter("commentId") %></b>
	<%
	out.print(session.getAttribute("post_id"));
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%>
</body>
</html>