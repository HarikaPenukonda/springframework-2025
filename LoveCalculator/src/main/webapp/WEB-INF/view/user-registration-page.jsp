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
	.err{
		color: red;
		font-style: italic;
		position: fixed;
		text-align: left;
	
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
			Coding <form:checkbox path="hobbies" value="Coding"/>
			Travelling <form:checkbox path="hobbies" value="Travelling"/>
			Reading <form:checkbox path="hobbies" value="Reading"/>
			Vlogging <form:checkbox path="hobbies" value="Vlogging"/>
			Gaming <form:checkbox path="hobbies" value="Gaming"/>
		</div>
		<br>
		<div>
			<label>Gender : </label>
			Male<form:radiobutton path="gender" value="Male"/>
			Female<form:radiobutton path="gender" value="Female"/>
		</div>
		<br>
		<div>
			<label>Age : </label>
			<form:input path="age"/>
			<form:errors class="err" path="age"/>
		</div>
		<div>
			<h4>Contact Us</h4>
			<label>Email</label>
			<form:input path="communicationDTO.email"/> <!-- Nested Object example - getCommunicationDTO().getEmail() -->
		</div>
		<br>
		<label>Phone</label>
			<form:input path="communicationDTO.phone"/>
		</div>
		<br>
		<input type="submit" value="register">
	</form:form>
	 <div class="form-footer">
            <p>Already have an account? <a href="/">Login here</a>.</p>
        </div>
</body>
</html>