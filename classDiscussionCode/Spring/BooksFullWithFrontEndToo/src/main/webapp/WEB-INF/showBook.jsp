<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  

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
		
		
		<h1 style="padding: 5%;">Water Dancer</h1>
		
			
		<table class="table-striped table">
			<tr>
			
				<th>Review</th>
			
			</tr>
			<c:forEach items="${reviews}" var="review">
				<tr>
					<td><c:out value="${review.content}"/></td>
					
				</tr>
			</c:forEach>
				
		</table>
		
	</div>
</body>
</html>