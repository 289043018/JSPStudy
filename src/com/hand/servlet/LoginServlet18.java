package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet18 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet18() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("passwd");
		String returnUri = request.getParameter("return_uri");
		
		System.out.println("用户名======》"+uname);
		System.out.println("密码======》"+passwd);
		System.out.println("登录之前的页面======》"+returnUri);
		
		RequestDispatcher rd = null;
		if(uname == null || passwd == null){
			request.setAttribute("msg", "用户名或者密码为空");
			rd = request.getRequestDispatcher("/18/login.jsp");
			rd.forward(request, response);
		}else{
			if(uname.equals("汉得")&& passwd.equals("123456")){
				request.getSession().setAttribute("flag", "login_success");
				if(returnUri !=null){
					rd = request.getRequestDispatcher(returnUri);
					rd.forward(request, response);
				}else{
					rd = request.getRequestDispatcher("/18/index.jsp");
					rd.forward(request, response);
				}
			}else{
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户名或者密码错误");
				rd = request.getRequestDispatcher("/18/login.jsp");
				rd.forward(request, response);
			}
		}
		
		
		
		
	}

}
