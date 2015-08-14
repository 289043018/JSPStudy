package com.hand.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloservlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("===========init without parameters=======");
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("===========init  parameters=======");
		super.init(config);
	}
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===========service=======");
		//用于向客户端浏览器输出一个字符串
		PrintWriter pw =resp.getWriter();
		pw.print("hellowrld");
		pw.close();
	}

	@Override
	public void destroy() {
		System.out.println("===========distory=======");
		super.destroy();
	}



}
