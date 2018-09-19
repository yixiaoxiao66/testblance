package com.vst.blance.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	
	@RequestMapping("/toLogin")
	public String toLogin(@ModelAttribute("msg") String msg,HttpServletRequest request) {
		if(!StringUtils.isEmpty(msg)) {
			request.setAttribute("msg", msg);
		}
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, RedirectAttributes model) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("passwd");
		
		if ("123".equals(passwd) ){
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			return "redirect:/toHome.do";
		} else {
			model.addFlashAttribute("msg", "账号或密码不正确！");
			return "redirect:toLogin.do";
		}
		
	}
	
	@RequestMapping("/toHome")
	public String toHome() {
		return "home";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		// 清除Session
		session.invalidate();
		return "redirect:toLogin.do";
	}

	
}
