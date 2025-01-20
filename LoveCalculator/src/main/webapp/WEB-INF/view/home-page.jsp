<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.a{
		background-color: pink;
	}
	.hd{
	color: red
	}
	.l{
		font: 600;
		font-style:italic;
		color: red;
	}
	.s{
		font-style:italic;
		color: red;
		border-color: red;
	}
	.err{
		color: red;
		font-style: italic;
		position: fixed;
		text-align: left;
	
	}
</style>
<meta charset="UTF-8">
<title>Love Calculator</title>
</head>
<body class="a" align="center">
	<h1 class="hd">Love Calculator</h1>
	<hr>
	<form:form action="processhome" method="get" modelAttribute="userInfo">
		<div>
			<label class = "l" for="un" value="Your Name">Your Name</label>
			<form:input id="un" path="userName"></form:input>
			<div>
				<form:errors class="err" path="userName"></form:errors>
			</div>
			<br>
		</div>
		<br>
		<div>
			<label class = "l" for="cn">Crush Name</label>
			<form:input id="cn" path="crushName"/>
		</div>
		<br>
		<div>
			
			<form:checkbox path="termsAndConditions"/>
			<label>I have read the terms and conditions</label>
			<div>
				<form:errors class="err" path="termsAndConditions"></form:errors>
			</div>
			
		</div>
		<br>	
			<input class="s" type="submit" value=calculate>
		
		
	</form:form>
</body>
</html>