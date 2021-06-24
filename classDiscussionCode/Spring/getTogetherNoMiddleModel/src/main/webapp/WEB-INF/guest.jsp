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
	<title>Guest</title>
	<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/main.css" />
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	
	<div class="container">
	
		<h1>Guest Information:</h1>
		
		<h3>Name: <c:out value="${guest.name}"/></h3>
		
		<div class="container" style="background-color: rebecca-purple">
			<h2>Events Attending: </h2>
			
			<ul>
			
				<c:forEach items="${guest.eventsAttending}" var="event">
					<li> <c:out value="${event.eventName}"/> </li>
				</c:forEach>
				<!-- <li> this </li>
				<li> that </li>
				<li>another party z</li> -->
			</ul>
		
		</div>
		
		<h3>Add <c:out value="${guest.name}"/> to an event:</h3>
		
		<form action="/rsvp" method="post" modelAttribute="rsvpObject">
			<input type="hidden" name="guest" value='<c:out value="${guest.id}"/>'/>
			
				<select name="event" id="">
					<c:forEach items="${events}" var="event">
							<option value='<c:out value="${event.id}"/>'><c:out value="${event.eventName}"/></option>
					</c:forEach>
				</select>
				
			<input type="submit" value="Add"/>
		</form>
		
		<a href="/">Back</a>
	
	</div>
</body>
</html>