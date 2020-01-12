<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ilkic.com - Home</title>
</head>
<body>
<%@include file='/WEB-INF/views/template/menu.jsp'%>
ff
<br>
<c:out value="${sessionScope.UserEntity.name}"/>
<c:out value="${sessionScope.UserEntity.username}"/>

</body>
</html>