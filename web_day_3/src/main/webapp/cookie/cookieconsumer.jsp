<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키확인</title>
</head>
<body>
	<h1>쿠키확인</h1>

	<ul>
	<li> request: <%=request.getParameter("type") %>
		<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				out.append("<li>" + c.getName() + "  : " + c.getValue());
			}
		}
		%>
	</ul>
</body>
</html>