package com.ilkic.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping("/")
	public ModelAndView goHome() {
		ModelAndView modelView = new ModelAndView("index");

		return modelView;
	}
	

	@RequestMapping("/home")
	public ModelAndView goHome2() {
		ModelAndView modelView = new ModelAndView("index");

		return modelView;
	}
	
	
	@RequestMapping("/posts")
	public ModelAndView goPosts() {
		ModelAndView modelView = new ModelAndView("posts");

		return modelView;
	}
	
	
	@RequestMapping("/users")
	public ModelAndView goUsers() {
		ModelAndView modelView = new ModelAndView("index");

		return modelView;
	}
	

	
}
