package com.hongyewell.servlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
* @className:HelloServlet.java
* @classDescription:
* @author:yeye
* @createTime:2015年8月19日 下午2:40:47
*/
public class HelloServlet extends GenericServlet {

	/**
	* TODO
	*/
	private static final long serialVersionUID = 6118145983235484612L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
 
		resp.getOutputStream().write("hello servlet!!!!".getBytes());//向浏览器输出"hello servlet"字节流
		
	}

	
}
