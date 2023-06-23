<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계산 결과입니다.</h1>
	<%=request.getParameter("num1")%> +
	<%=request.getParameter("num2")%> =
	<%=request.getAttribute("result")%> +
</body>
</html>