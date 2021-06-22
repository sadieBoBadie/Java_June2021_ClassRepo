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
		
		
		<h1>Hello World!!!!</h1>
		
		<h2>Create a review</h2>
		
		
		<form:form action="/reviews" method="post" modelAttribute="reviewObject">
			
			<div class="form-group row">
				<form:label for="" path="book" class="col-sm-2 col-form-label">Select a book:</form:label>
				<form:errors path="content" style="color: red;"/>
				<form:select id="" path="book" class="dropdown">
					<c:forEach items="${allBooks}" var="book">
						<form:option value="${book}">${book.title}</form:option>
					</c:forEach>
				</form:select>
			</div>
			
			<div class="form-group row">
				<form:label for="" path="content" class="col-sm-2 col-form-label">Your Review:</form:label>
				<form:errors path="content" style="color: red;"/>
				<div class="col-sm-10">
					<form:input type="text" path="content" class="form-control"/>
				</div>
			</div>
			
			
			<input type="submit" value="Add Review" class="btn btn-primary"/>
			
		</form:form>
		
	</div>
</body>
</html>