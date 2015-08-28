package com.hongyewell.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//文件下载
public class ServletDownLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        //获取文件路径和文件名
		String path = this.getServletContext().getRealPath("/download/艾薇儿.jpg");
		String filename = path.substring(path.lastIndexOf("\\") + 1);
        //发送响应头
	/*	response.setHeader("content-disposition", "attachment;filename=" + filename);*/
		//如果是中文文件，则要设置文件名的编码
		response.setHeader("content-disposition", "attachment;filename=" +URLEncoder.encode(filename));

		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(path);
			int len = 0;
			byte buffer[] = new byte[1024];
			out = response.getOutputStream();
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);

			}

		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
