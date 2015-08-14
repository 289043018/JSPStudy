package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {


	private static final long serialVersionUID = 354178950219205694L;

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String userName = req.getParameter("userName");
//		String password = req.getParameter("password");
//		
//		System.out.println("用户名====》"+userName);
//		System.out.println("密码==========》"+password);
//
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=========进入doGet方法========");
//		String userName = req.getParameter("userName");
//		String password = req.getParameter("password");
//		
//		System.out.println("用户名====》"+userName);
//		System.out.println("密码==========》"+password);
		doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=========进入doPost方法========");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		System.out.println("用户名====》"+userName);
		System.out.println("密码==========》"+password);
		
		String forward=null;
		
		if(userName.equals("jky") && password.equals("hand")){
			//请求转发
			forward = "/16/success.jsp";
			//请求的调度器，封装了客户端的请求，然后转发到指定的资源上去参数是转发的地址
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			//通过RequestDispatcher的forward方法来完成转发操作。
			rd.forward(req, resp);
			
			
			//请求重定向
			//			resp.sendRedirect(req.getContextPath()+"/15/success.jsp");
		}else{
			//请求转发
			forward = "/16/error.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
//			resp.sendRedirect(req.getContextPath()+"/15/error.jsp");
		}
	}

}
