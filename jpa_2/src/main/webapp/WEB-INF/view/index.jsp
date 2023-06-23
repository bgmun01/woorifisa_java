<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/common.css">
</head>
<body>
	<h1 id="title">Welcome!!</h1>
	<ul>
		<li><a href="/hello?name=hong">hello</a> <%--//이렇게 처음 요청이 오면 컨트롤러가 필요하다 --%>
		</li>
		<li><a href="/onlypost"> 포스트만 가능 </a></li>
		<li>
		<a href="/user/login"> 로그인 </a>
		</li>
		<li>
		<a href="/city/regist"> 도시등록 </a>
		</li>
		<li>
		<a href="/city/list"> 목록 </a>
		</li>
	</ul>
	<h1>도시 조회 - forward</h1>
	<form method="get" action="/city/select">
		<input type="text" name="no"> <input type="submit">
	</form>

	<h1>도시 조회 - redirect</h1>
	<form method="get" action="/city/select2">
		<input type="text" name="no"> <input type="submit">
	</form>

	<h1>회원 가입</h1>
	<form action="/user/join" method="post">
		<label>취미는?</label>
		<input type="checkbox" name="hobby" value = "study" id="study">
		<label for = "study">공부</label>
		<input type="checkbox" name="hobby" value = "eat" id="eat">
		<label for = "eat">먹기</label>
		<input type="checkbox" name="hobby" value = "health" id="health">
		<label for = "health">헬스</label>
		<input type = "submit">
	</form>

</body>
</html>