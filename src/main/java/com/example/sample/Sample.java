package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Sample {
	@RequestMapping("/name")
	public String name(HttpServletRequest req) {
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("displayname",name);
		return "NewFile.jsp";
	}
}
