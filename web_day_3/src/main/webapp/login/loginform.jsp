<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="/web_day3/login" method="post">  <!-- loginservlet이 받음 -->
		<!-- 보안상의 이유로 post로 -->
		<input name="id" type="text"> 
		<input name="password" type="password"> 
		<input type="submit" value="login">
	</form>
</body>
</html>