package com.hongyewell.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//forward细节
public class ServletRequestDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String data ="hello hongyewell";
		if (true) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			return ;
		}
		
		//以下跳转会导致：Cannot forward after response has been committed
		request.getRequestDispatcher("/message.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
