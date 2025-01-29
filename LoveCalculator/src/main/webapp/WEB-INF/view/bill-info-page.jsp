<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your payment info</title>
</head>
<body align = center>
	<h3>Payment successful</h3>
	<br>
	<h4>Your Full Name : ${billData.userName}</h4>
	<h4>Credit Card Number : ${billData.creditCard}</h4>
	<h4>Amount : ${billData.amount}</h4>
	<h4>Currency : ${billData.currency.getSymbol()}</h4>
	<h4>Date : ${billData.date}</h4>
</body>
</html>