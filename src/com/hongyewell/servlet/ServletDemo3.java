package com.hongyewell.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	/**
	 * servletConfig对象，用于封装servlet的配置信息。
	 */
		
		
	/*//得到指定的
	String value = this.getServletConfig().getInitParameter("data");
	System.out.println(value);*/
		
		
		//得到所有的
	    Enumeration e = this.getServletConfig().getInitParameterNames();
	    while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value2 = this.getServletConfig().getInitParameter(name);
			System.out.println(name + "=" + value2);
			
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
	
}
