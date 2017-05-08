package com.sloshify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;


@Controller
public class sloshifyHome {
	
	DatabaseConfig database;
	
	@PostConstruct
	public void onStartup(){
		database = new inMem(false);
	}
	
 
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
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addForm() {
			return new ModelAndView("add", "command", new Song());
	}
	
    @RequestMapping(value = "/add", method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("song") Song song){  
        
    	database.add("default", song);
    	
        System.out.println(song.getName()+" "+ song.getBPM()+" "+ song.getDuration());  
       
          
        return new ModelAndView("redirect:/viewsongs");//will display object data  
    }  
    
    @RequestMapping("/viewsongs")  
    public ModelAndView viewsongs(){  

        List<Song> list= database.load("default");
        
        return new ModelAndView("viewsongs","list",list);  
    }  
	
	
}