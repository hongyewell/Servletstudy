package com.hongyewell.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过response的write流输出数据
 * 
 * @desc: Servletstudy
 * @author: yeye
 * @createTime: 2015年8月28日 下午1:29:38
 * @history:
 * @version: v1.0
 */
public class ServletResponse extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//设置response使用的编码，以控制response以什么编码向浏览器写出数据
		response.setCharacterEncoding("utf-8");
		
		//指定浏览器以什么编码方式打开服务器发送的数据
		//response.setHeader("content-type", "text/html;chartset=UTF-8");
		response.setContentType("text/html;chartset=UTF-8");
		
		String data = "红叶";
		PrintWriter out = response.getWriter();
		out.write(data);
		
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {


		doGet(request, response);
	}

}
