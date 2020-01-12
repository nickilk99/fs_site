package com.ilkic.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.service.UserService;

@Controller
public class PageController {
	
	@Autowired
	UserService service;
	
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

	
	
	@RequestMapping("/private")
	public ModelAndView goPrivate() {
		ModelAndView modelView = new ModelAndView("private");

		return modelView;
	}
}
