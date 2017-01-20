package com.sloshify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sloshifyHome {
 
	@RequestMapping("/login")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Login</div><br><br>";
		return new ModelAndView("login", "message", message);
	}
}