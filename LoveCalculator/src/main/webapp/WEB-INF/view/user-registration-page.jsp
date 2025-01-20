<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.bd{
		background-color: #F7CAD8
	}
	.a{
		color: Red
	}
</style>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body class="bd" align="center">
	<h3 class="a"> Register Here </h3>
	<form:form action="register-success" method="get" modelAttribute="userInfo">
		<div>
			<label>Full Name</label>
			<form:input path="fullName"/>
		</div>
		
		<br>
		<div>
			<label>User Name</label>
			<form:input path="userName"/>
		</div>
		<br>
		<div>
			<label>Password</label>
			<form:input path="password"/>
		</div>
		<br>
		<div>
			<label>Country</label>
			<form:select path="country">
				<form:option value="aus">Australia</form:option>
				<form:option value="can">Cananda</form:option>
				<form:option value="ind">India</form:option>
				<form:option value="uk">UK</form:option>
				<form:option value="usa">USA</form:option>
			</form:select>
		</div>
		<br>
		<div>
			<label>Hobbies :</label>
			Coding <form:checkbox path="hobbies" value="code"/>
			Travelling <form:checkbox path="hobbies" value="tr"/>
			Reading <form:checkbox path="hobbies" value="read"/>
			Vlogging <form:checkbox path="hobbies" value="vlog"/>
			Gaming <form:checkbox path="hobbies" value="game"/>
		</div>
		<br>
		<div>
			<label>Gender : </label>
			Male<form:radiobutton path="gender" value="m"/>
			Female<form:radiobutton path="gender" value="f"/>
		</div>
		<br>
		
		<input type="submit" value="register">
	</form:form>
	 <div class="form-footer">
            <p>Already have an account? <a href="/">Login here</a>.</p>
        </div>
</body>
</html>