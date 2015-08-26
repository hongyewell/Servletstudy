package com.hongyewell.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hongyewell.dao.UserDao;

//servlet调用其他程序，在其他程序中怎么去读取资源文件 （通过类装载器）
public class ServletProperties extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	UserDao userDao = new UserDao();
	userDao.update();
	
	
	}


}
