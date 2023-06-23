<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var = "root" value="${pageContext.servletContext.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// scriptlet : _jsp service의 local 영역 !! 로컬변수 선언을 쓸 수 있다?
		String name = "hong";
	//	request. //이미 만들어져 있어서 사용할 수 있다.
	%>
	<!--  expression --> 
	<%-- jsp 주석을 클라이언트에 보내지 않음 따라서 jsp 주석을 사용해야함 해야 html에 남아있지 않음 --%>
	<%=name %>
	
	<%!
	// <%! - declaration tag : member 변수, 메서드 구성 클래스영역
		public String hi(String name){
		return "hi " +name;
	}
	%>
	<%=hi("jang") %>
	
	<h1>더해볼까??</h1>
	<form action = "${root }/Add" method="get">
		<input type = "checkbox" name = "type" value = "forward" id = "type">
		<label for = "type"> forward </label>
		<input name = "num1" type="text">
		<input name = "num2" type="text">
		<input type = "submit" value="더해!!">
 	</form>	
	
	<c:if test="${empty loginName}">   <h1>로그인 해볼까? - 세션에서 loginName이 없을 때만 필요!</h1>
   <form action="${root }/login" method="post">
      <label for="type">id</label> 
      <input type="text" name="id"> 
      <label for="type">pass</label> 
      <input type="password" name="pass"> 
      <input type="submit" value="login">
   </form>
   </c:if>
<	<c:if test="${!empty loginName }">   
 		${loginName}님 반갑습니다.
   		<a href="${root }/logout">로그아웃</a>
    </c:if>
	
	
	
	<h1>쿠키</h1>
	<a href="${root }/CookieMaker?type=forward">forward로 쿠키 만들기</a><br>
	<a href="${root }/CookieMaker?type=redirect?">redirect로 쿠키 만들기</a><br>
	
	
	<h1>scope 확인</h1>
	<a href="${root }/FirstServlet?type=forward">forward로 Scope 만들기</a><br>
	<a href="${root }/FirstServlet?type=redirect?">redirect로 Scope 만들기</a><br>
	
</body>
</html>