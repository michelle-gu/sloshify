package com.sloshify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sloshifyHome {
 
	@RequestMapping("/login")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome</div><br><br>";
		return new ModelAndView("login", "message", message);
	}
	
	@RequestMapping("/dj")
	public ModelAndView dj() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>SPOTIFY PLAYER GOES HERE</div><br><br>";
		return new ModelAndView("dj", "message", message);
	}
	
	@RequestMapping("/library")
	public ModelAndView library() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>SONG CLASSIFICATIONS GO HERE</div><br><br>";
		return new ModelAndView("library", "message", message);
	}
	
	@RequestMapping("/events")
	public ModelAndView events() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>UPCOMING EVENTS GO HERE</div><br><br>";
		return new ModelAndView("events", "message", message);
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>SLOSH INFO GOES HERE</div><br><br>";
		return new ModelAndView("about", "message", message);
	}
}