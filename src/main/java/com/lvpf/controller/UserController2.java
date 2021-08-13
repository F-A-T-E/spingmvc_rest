package com.lvpf.controller;

import com.lvpf.bean.Address;
import com.lvpf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 乱码问题解决
 * 需要设置request和Response的编码方式，可以自己手动编写过滤器
 * 也可以由现成的框架来实现
 *  post: 必须要分别设置request和response的编码格式
 *  get: 在tomcat的server.xml文件中，添加URIEncoding = utf-8
 *
 *  在同一个应用程序中可能会包含N多个过滤器，这N多个过滤器一般是没有顺序要求的，但是如果你设置了编码过滤器；
 *  那么要求必须将编码过滤器设置到最上面，保证编码过滤器优先执行
 *
 */
@Controller
public class UserController2 {

	@RequestMapping("/testUser")
	public String testUser(User user){
		System.out.println(user.toString());
		return "success";
	}

	@RequestMapping("/api")
	public String servletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		request.setAttribute("request","request");
		session.setAttribute("session","session");
		return "success";
	}
}
