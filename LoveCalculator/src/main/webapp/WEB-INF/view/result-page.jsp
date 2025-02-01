<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calculator</title>
</head>
<body>
	<body>
	<div align="center">
	<h1 class="hd">Love Calculator</h1>
	<hr>
	
	<h4>The Love Calculator Predicts : </h4>
	<h4>${userInfo.userName} and ${userInfo.crushName} are : </h4>
	<h4>Friends</h4>
	<br>
	</div>
	
	<br>
	<h5><a href=/LoveCalculator/sendemail/${userInfo.userName}>send result to email</a></h5>
	<h5><a href=#>try with someone else</a></h5>
	<h5><a href=#>Check user history</a></h5>
	
</body>
</html>