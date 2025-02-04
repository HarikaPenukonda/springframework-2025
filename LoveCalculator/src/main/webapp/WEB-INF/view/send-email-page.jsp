<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send Email</title>
<style type="text/css">
.a{
	font-style: italic;
	color: red
}

</style>
</head>
<body align = center>
	<div>
	<h1>Love Calculator</h1>
	<hr>
		<form:form method="GET" action="process-email" modelAttribute="emailDTO">
		<h2>Hi <span class=a>${userName},</span></h2>
		<div>
			<label>Your Email ID : </label>
			<form:input path="userEmail"/>
		</div>
			<br>
			<input type="submit" value="send">
		</form:form>
	</div>
</body>
</html>