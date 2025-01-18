
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
</style>
<meta charset="UTF-8">
<title>Love Calculator</title>
</head>
<body class="a" align="center">
	<h1 class="hd">Love Calculator</h1>
	<hr>
	<form action="processhome" method="get">
		<div align= "center">
			<label class = "l" for="un" value="Your Name">Your Name</label>
			<input type="text" id="un" name="userName"/>
			
			<label class = "l" for="cn">Crush Name</label>
			<input type="text" id="cn" name="crushName"/>
			
			<input class="s" type="submit" value=calculate>
		</div>
		
	</form>
</body>
</html>