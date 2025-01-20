<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.b{
		background-color: #F7CAD8
	}
	.h{
		color: red
	}
</style>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body class="b" align="center">
	<h3 class = "h">User Registered Successfully!!!</h3>
	<h4>Full Name : ${userReg.fullName}</h4>
	<h4>User Name : ${userReg.userName}</h4>
	<h4>Password : ${userReg.password}</h4>
	<h4>Country : ${userReg.country}</h4>
	<h4>
	
		Hobbies : 
		<c:forEach var=temp items=${userReg.hobbies}>
			${temp}
		</c:forEach>
	
	</h4>
	<h4>Gender : ${userReg.gender}</h4>
	
</body>
</html>