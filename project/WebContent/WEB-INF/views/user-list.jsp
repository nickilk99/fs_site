<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Ilkic.com - User List</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        <%@include file="/WEB-INF/views/css/main.css"%>
    </style>
</head>

<body>
    <header>

    </header>
    <main>
        <%@include file="/WEB-INF/views/template/menu.jsp"%>

        <div class="rightBar">3</div>




        <div class="middleSection">
            <div align="center">
                Cool Student List
                <table border="1">
                    <tr>
                        <th>name</th>
                        <th>user name</th>
                        <th>email</th>
                    </tr>

                    <c:forEach var="user" items="${userList}">
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
                            <td><a href="edituser?userId=${user.id}">update
                                    me!</a></td>
                            <td><a href="deleteuser?userId=${user.id}">delete
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
%></html>