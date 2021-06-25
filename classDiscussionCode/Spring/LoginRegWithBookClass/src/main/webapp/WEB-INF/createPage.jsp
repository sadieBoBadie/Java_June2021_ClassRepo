<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AWESOME PAGE BRUH!!</title>
	<link rel="stylesheet" href="main.css" />
	<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css" />
	<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		
		
		<h1>Hello <c:out value="${user.userName}"/></h1>
		
		<h2>Add a Book</h2>
		
		
		<form:form action="/books" method="post" modelAttribute="bookObject" style="margin: 5% 20%;">
			
			
			<form:input type="hidden" path="user" value="${user.id}"/>
			
			<div class="form-group row">
				<form:label for="" path="title" class="col-sm-2 col-form-label">Title:</form:label>
				<form:errors path="title" style="color: red;"/>
				<div class="col-sm-10">
					<form:input type="text" path="title" class="form-control"/>
				</div>
			</div>
			
			<div class="form-group row">
				<form:label for="" path="description" class="col-sm-2 col-form-label">Description:</form:label>
				<form:errors path="description" style="color: red;"/>
				<div class="col-sm-10">
					<form:input type="text" path="description" class="form-control"/>
				</div>
			</div>
			
			<div class="form-group row">
				<form:label for="" path="numberOfPages" class="col-sm-2 col-form-label">Number of Pages:</form:label>
				<form:errors path="numberOfPages" style="color: red;"/>
				<div class="col-sm-10">
					<form:input type="text" path="numberOfPages" class="form-control"/>
				</div>
			</div>
			
			<div class="form-group row">
				<form:label for="" path="language" class="col-sm-2 col-form-label">Language:</form:label>
				<form:errors path="language" style="color: red;"/>
				<div class="col-sm-10">
					<form:input type="text" path="language" class="form-control"/>
				</div>
			</div>
			
			<input type="submit" value="Add Book" class="btn btn-primary"/>
			
		</form:form>
		
	</div>
</body>
</html>