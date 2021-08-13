package com.lvpf;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		System.out.println(this.getClass().getName()+"---------------start");
		servletRequest.setCharacterEncoding("UTF-8");
		servletResponse.setCharacterEncoding("UTF-8");
		filterChain.doFilter(servletRequest,servletResponse);
		System.out.println(this.getClass().getName()+"---------------STOP");
	}


	@Override
	public void destroy() {
		System.out.println("destory");
	}
}
