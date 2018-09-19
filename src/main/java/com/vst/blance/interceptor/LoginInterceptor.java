package com.vst.blance.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/* 登录验证*/
		
		// 获取Session
		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		String url = request.getRequestURI();
		// URL:login.jsp是公开的
		// 注意：一些静态文件不能拦截，否则会死循环，知道内存耗尽
		if (url.indexOf("login") >= 0 || url.indexOf("toLogin") >= 0 
				|| url.indexOf("logout") > 0) {
			return true;
		} else {
			if (uname != null) {
				return true;
			} else {
				response.sendRedirect(request.getContextPath()+"/toLogin.do");
				return false;
			}
		}

	}


}
