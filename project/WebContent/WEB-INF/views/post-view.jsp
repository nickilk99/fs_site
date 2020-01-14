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
</body>
</html>





