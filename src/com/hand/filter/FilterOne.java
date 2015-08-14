package com.hand.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterOne
 */

public class FilterOne implements Filter {

    /**
     * Default constructor. 
     */
    public FilterOne() {
        System.out.println("========= FilterOne构造函数=========");
    }
    
    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("=========FilterOne初始化方法=========");
    	String initParam = fConfig.getInitParameter("param");
    	System.out.println("param =="+initParam);
	}
    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse 
    		response, FilterChain chain) throws IOException, ServletException {
    	System.out.println("=========FilterOne开始执行dofilter方法=========");
    	
    	chain.doFilter(request, response);
    	System.out.println("=========FilterOne结束执行dofilter方法=========");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("=========FilterOne销毁方法=========");
	}




}
