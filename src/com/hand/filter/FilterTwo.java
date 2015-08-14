package com.hand.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class FilterTwo implements Filter {

    /**
     * Default constructor. 
     */
    public FilterTwo() {
    	System.out.println("========= FilterTwo构造函数=========");
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("========= FilterTwo初始化函数=========");
	}

    
	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	System.out.println("=========FilterTwo开始执行dofilter方法=========");
		chain.doFilter(request, response);
    	System.out.println("=========FilterTwo开始结束dofilter方法=========");
	}
	
	
	public void destroy() {
		System.out.println("=========FilterTwo结束执行dofilter方法=========");
	}

}
