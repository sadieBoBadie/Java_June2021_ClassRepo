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
	<title>getTogether</title>
	<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css" />
	<link rel="stylesheet" href="main.css" />
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	
	<div class="container">
	
	
		<h1>Welcome to getTogether!</h1>
		
		<form:form action="/guests" method="post" class="form container" modelAttribute="guestObject">
			
			<h2>Add a new Guest</h2>
			<div class="form-group row">
				<form:label for="" path="name" class="col-form-label col-sm-2">Guest Name: </form:label>
				<div class="col-sm-10">
					<form:input type="text" path="name" class="form-control" placeholder="Name"/>
				</div>
			</div>
			
			<div class="form-group row">
				<div class="offset-sm-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="Register Guest"/>
				</div>
			</div>
			
		</form:form>
		
		<form:form action="/events" method="post" class="form container" modelAttribute="eventObject">
			<h2>Create a new Event</h2>
			<div class="form-group row">
				<form:label for="" path="eventName" class="col-form-label col-sm-2">Event Name: </form:label>
				<div class="col-sm-10">
					<form:input type="text" path="eventName" class="form-control" placeholder="Name"/>
				</div>
			</div>
			
			<div class="form-group row">
				<form:label for="" path="eventDate" class="col-form-label col-sm-2">Event Date: </form:label>
				<div class="col-sm-10">
					<form:input type="date" path="eventDate" class="form-control" placeholder="Name"/>
				</div>
			</div>
			
			<div class="form-group row">
				<div class="offset-sm-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="Register Event"/>
				</div>
			</div>
			
		</form:form>
		
		<div class="flex-container">
		
			<div>
			
				<h3>Active Guests</h3>
				
				<ul>
					<c:forEach items="${allGuests}" var="guest">
						<li><a href='/guests/<c:out value="${guest.id}"/>'><c:out value="${guest.name}"/></a></li>
					<!-- <li><a href="/guests/1">Elvira</a></li>
					<li><a href="/guests/2">Sabrina</a></li>
					<li><a href="/guests/3">Dracula</a></li>
					<li><a href="/guests/4">Frankenstein's Monster</a></li> -->
					</c:forEach>
				</ul>
			
			</div>
			
			<div>
			
			<h3>Events</h3>
				
				<ul>
					<c:forEach items="${allEvents}" var="event">
						<li><a href='/events/<c:out value="${event.id}"/>'><c:out value="${event.eventName}"/></a></li>
					</c:forEach>
					
					
					
					<!-- <li><a href="events/1">Apple Bob</a></li>
					<li><a href="events/1">Dunk the Monk</a></li>
					<li><a href="events/1">Trick or Treating</a></li>
					<li><a href="events/1">Haunted House Crawl</a></li> -->
				</ul>
			</div>
		
		</div>
		
	</div>
	
	
</body>
</html>