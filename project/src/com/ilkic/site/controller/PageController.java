package com.ilkic.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.UserEntity;
import com.ilkic.site.service.UserService;

@Controller
public class PageController {

	@Autowired
	UserService service;

	@RequestMapping({ "/", "/home", "/index" })
	public ModelAndView goHome() {
		ModelAndView modelView = new ModelAndView("index");
		return modelView;
	}

	@RequestMapping("/register")
	public ModelAndView goRegister() {
		ModelAndView modelView = new ModelAndView("registration");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}

	@RequestMapping("/login")
	public ModelAndView valdate(@ModelAttribute("user") UserEntity usr) {
		ModelAndView modelView = new ModelAndView("login");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}

}
