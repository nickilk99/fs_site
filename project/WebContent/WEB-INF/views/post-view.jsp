<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.ilkic.site.model.PostEntity" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <style>
        <%@include file="/WEB-INF/views/css/main.css"%>

    </style>
    <title>Ilkic</title>
</head>

<body>
    <%@include file="/WEB-INF/views/template/header.jsp"%>
    <main>
        <%@include file="/WEB-INF/views/template/menu.jsp"%>

        <div class="rightBar"></div>

        <div class="middleSection">

            <div class="blogPost">
                <h2>
                    <c:out value="${requestScope.singlePost.title}" />
                </h2>
                <p>
                    <c:out value="${requestScope.singlePost.postBody}" />
                </p>
                Posted By:
                <c:out value="${requestScope.singlePost.author.name}" />
            </div>

            <div class="blogPost">
            <br>
            <div class="center">
                <a href='/project/editComment?commentId=<c:out value="${requestScope.singlePost.id}"/>'>Leave a comment!</a>
            </div>
            </div>
        </div>

        <div class="middleSection">

            <br><br><br>
            <div>
                <c:forEach var="comments" items="${commentList}">

                    <div class="commentBox">


                        <p class="commentBody">
                            <c:out value="${comments.commentBody}"></c:out>
                        </p>

                        <p class="commentBody">
                            <strong>Posted by <c:out value="${comments.author.name}"></c:out> on <c:out value="${comments.createDate}"></c:out></strong>
                        </p>
                    </div>

                </c:forEach>

            </div>


        </div>
    </main>
</body>

</html>
