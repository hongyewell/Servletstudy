package com.hongyewell.servlet;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hongyewell.projo.User;
import com.sun.javafx.collections.MappingChange.Map;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

//获取请求头和请求数据
public class ServletRequestDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		/*
	     test1(request);*/
		
		/*String value = request.getParameter("username");
		String value2 = request.getParameter("name");
		System.out.println(value);
		System.out.println(value2);*/
		
		
		/*Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = request.getParameter(name);
			System.out.println(name+"="+value);
			
		}*/
		
		/*String[] values= request.getParameterValues("username");
		for(String v:values){
			System.out.println(v);
			
		}*/
		
		/*String[] values= request.getParameterValues("username");
		for(int i=0 ;values!=null&& i<values.length;i++){
			System.out.println(values[i]);
		}*/
		
		/*Map map = (Map) request.getParameterMap();
		User user = new User();
		BeanUtils.populate(user,map)???*/
		
	}
    //获取头相关的方法
	private void test1(HttpServletRequest request) {
		String headValue =	request.getHeader("Accept-Encoding");
	     System.out.println(headValue);
	     
	     System.out.println("----------------------");
	     Enumeration e =request.getHeaders("Accept-Encoding");
	     while (e.hasMoreElements()) {
			String value = (String) e.nextElement();
			System.out.println(value);		
		}
	     
	     System.out.println("----------------------");
	     e = request.getHeaderNames();
	     while(e.hasMoreElements()){
	    	 String name = (String) e.nextElement();
	    	 String value = request.getHeader(name);
	    	 System.out.println(name + "=" +value);
	     }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
