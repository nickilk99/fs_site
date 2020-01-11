package com.ilkic.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.UserEntity;
import com.ilkic.site.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping(value = "/getusers", method = RequestMethod.GET)
	public ModelAndView getUsersList() {
		ModelAndView modelView = new ModelAndView("user-list");

		List<UserEntity> users = service.getUsers();
		modelView.addObject("userList", users);
		modelView.addObject("user", new UserEntity());

		return modelView;
	}
	
	
	
	@RequestMapping("/login")
	public ModelAndView valdate(@ModelAttribute("user") UserEntity usr) {
		ModelAndView modelView = new ModelAndView("login");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}
	
	
	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public String login(@ModelAttribute("student") UserEntity usr) {
		String username = usr.getUsername();
		String password = usr.getPassword();
		
		if (service.validate(username, password))
			return "redirect:/index";
		else {
			return "ErrorPage";
		}
	}
	
	
	
	
}
