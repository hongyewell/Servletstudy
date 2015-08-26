package com.hongyewell.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/**
 * 
 * 如果读取资源文件的程序不是servlet的话，就只能通过类装载器去读
 * 
* @className:UserDao.java
* @classDescription:
* @author:yeye
* @createTime:2015年8月26日 下午5:29:31
*/
public class UserDao {
	/*
	private static Properties dbconfig = new Properties();
	
	static{
		try {
			InputStream in =	UserDao.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			dbconfig.load(in);
			
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}*/
	
	public void update() throws IOException{
	
		//通过类装载的方式得到资源文件的位置，再通过传统方式读取资源文件的数据，这样可以读取到更新后的数据。
    String path = UserDao.class.getClassLoader().getResource("dbconfig.properties").getPath();
	FileInputStream in = new FileInputStream(path);
 
	Properties prop = new Properties();
	prop.load(in);
	
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("driver"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	}

}
