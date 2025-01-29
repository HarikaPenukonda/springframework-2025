<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My bill page</title>
</head>
<body align="center">
	<h2>For premium subscription complete your payment here</h2>
	<form:form action="bill-success" modelAttribute="billData">
	<div>
		<h3>Enter your payment details</h3>
	</div>
	<br>
	<div>
		<label>Your Name : </label>
		<form:input path="userName"/>
	</div>
	<br>
	<div>
		<label>Credit Card : </label>
		<form:input path="creditCard"/>
	</div>
	<br>
	<div>
		<label>Amount : </label>
		<form:input path="amount"/>
	</div>
	<br>
	<div>
		<label>Currency : </label>
		<form:input path="currency"/>
	</div>
	<br>
	<div>
		<label>Date : </label>
		<form:input path="date"/>
	</div>
	<br>
	<input type="submit" value="pay">
	</form:form>
	
</body>
</html>