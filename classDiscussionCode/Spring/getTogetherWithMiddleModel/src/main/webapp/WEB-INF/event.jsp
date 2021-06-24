<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!-- Date formatting: -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EVENT</title>
	<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/main.css" />
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	
		<h1>Event Details for <c:out value="${event.eventName}"/></h1>
		
		<h3>Date: </h3>
		
		<div class="container" style="background-color: rebecca-purple">
			<h2>Guest List: </h2>
			
			<ul>
				<c:forEach items="${rsvps}" var="rsvp">
					<li><c:out value="${rsvp.guest.name}"/> with the meal choice of <c:out value="${rsvp.mealChoice}"/></li>
				</c:forEach>
				
			</ul>
		
		</div>
		
		<a href="/">Back</a>
	
	</div>
	
</body>
</html>