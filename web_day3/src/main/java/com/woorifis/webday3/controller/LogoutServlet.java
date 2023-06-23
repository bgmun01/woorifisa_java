package com.woorifis.webday3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자의 session을 종료시키고 index.jsp로 이동하시오
		HttpSession session = request.getSession();
		session.invalidate();
		
		//index.jsp로 이동 // 리다이렉트 다시 새로운 url로 이동시켜주니까
		//forward 로 가면 로그아웃으로 간다 로그아웃으로 했으니 새삶 리다이렉트
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		
	}

}
