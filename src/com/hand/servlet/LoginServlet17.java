package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet17 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet17() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=========进入doPost方法========");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		System.out.println("用户名====》"+userName);
		System.out.println("密码==========》"+password);
		
		String forward=null;
		
		if(userName.equals("汉得") && password.equals("123456")){
			//请求转发
			forward = "/17/success.jsp";
			//请求的调度器，封装了客户端的请求，然后转发到指定的资源上去参数是转发的地址
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			//通过RequestDispatcher的forward方法来完成转发操作。
			rd.forward(request, response);
			
			
			
		}else{
			//请求转发
			forward = "/17/error.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);

		}
	}


}
