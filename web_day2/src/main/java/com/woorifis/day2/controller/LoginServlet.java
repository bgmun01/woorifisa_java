package com.woorifis.day2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
@Slf4j
public class LoginServlet extends HttpServlet {
	
	public LoginServlet () {
		log.debug("생성자 호출됨 !!!");
		
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		log.debug("init 호출됨 !!!");
	}
	
	public void destory() {
		super.destroy();
		log.debug("넌 언제 되니?? destroy - init에서 초기화된 리소스를 닫는다.");
	}
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 가져오기
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		log.debug("id: {}, pass : {}", id, pass);
		
		//id & pass를 db에 가서 확인해본다!
		
		//응답
		String msg = "<html><body><h1>홍길동님 반갑</h1></body></html>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(msg);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 가져오기
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		log.debug("post: id: {}, pass : {}", id, pass);
		
		//id & pass를 db에 가서 확인해본다!
		
		//응답
		String msg = "<html><body><h1> "+id+" 반갑. </h1></body></html>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(msg);
	}
	}


