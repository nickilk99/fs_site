<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - User List</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        <%@include file="/WEB-INF/views/css/main.css"%>
    </style>
</head>

<body>
<%@include file="/WEB-INF/views/template/header.jsp"%>
    <main>
        <%@include file="/WEB-INF/views/template/menu.jsp"%>

        <div class="rightBar"></div>




        <div class="middleSection">
            <div align="center">
                User List
                <table border="1">
                    <tr>
                        <th>name</th>
                        <th>user name</th>
                        <th>email</th>
                    </tr>

                    <c:forEach var="user" items="${userList}"><br>
                        <tr>
                            <td>
                                <c:out value="${user.name}"></c:out>
                            </td>
                            <td>
                                <c:out value="${user.username}"></c:out>
                            </td>
                            <td>
                                <c:out value="${user.email}"></c:out>
                            </td>
                        </tr>
                    </c:forEach>

                </table>
            </div>
        </div>



</main>

</body>
<%
String user = null;
if(session.getAttribute("UserEntity") == null){
	response.sendRedirect("login.html");} 
%></html>