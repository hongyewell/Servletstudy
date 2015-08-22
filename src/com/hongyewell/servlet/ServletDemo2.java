package com.hongyewell.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @desc: Servletstudy
 * @author: yeye
 * @createTime: 2015年8月20日 下午4:36:37
 * @history:
 * @version: v1.0
 */
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.getOutputStream().write("hello httpservlet~~~".getBytes());
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//不管客户机发送的是doGet还是doPost请求，都由doGet处理
		
		doGet(request, response);
	}

}
