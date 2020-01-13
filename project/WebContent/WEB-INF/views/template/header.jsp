<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header>
<div class="headerTitle">
<h1>Blog Site</h1>
</div>



<div class="headerRight">
<% if(session.getAttribute("UserEntity") != null){ %>Welcome, <c:out value="${sessionScope.UserEntity.username}"/>. <a href="/project/logout">Logout</a><% } 
		
	 else { %> <a href="/project/login">Login</a> <% } %>			


</div>
</header>