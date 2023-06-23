package com.woorifis.webday3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. parameter 처리
		request.setCharacterEncoding("utf-8");
		String product = request.getParameter("product");
		// 2. business logic 처리
		
		// 3. presentation logic 처리
		// product를 cart에 담자.
		// 기존 카트 찾아보기
		HttpSession session = request.getSession();
		Object objCart = session.getAttribute("cart");
		if(objCart==null) {
			List<String> cart = new ArrayList<>();
			cart.add(product);
			session.setAttribute("cart", cart); //카트에다 방금 만든 카트를 담아준다? 만약 있다면 밑에
		
		}else {//객체의 형변환 필요?
			if(objCart instanceof List) {
				List<String> cart = (List)objCart;
				cart.add(product);
				// 의미없다. session.setAttribute("cart", cart);
			}
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("/login/loginResult.jsp");
		disp.forward(request, response);
		
		
	}

}
