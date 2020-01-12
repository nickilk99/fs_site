package com.ilkic.site.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.PostEntity;
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
	public String login(@ModelAttribute("user") UserEntity usr, HttpSession session) {

		
		if (service.validate(usr, session))
			
			return "redirect:/home";
		else {
			return "ErrorPage";
		}
	}
	
	
	
	@RequestMapping(value = "createUser", method = RequestMethod.POST)
	public String createPost(@ModelAttribute("user") UserEntity user) {
		if (service.addUser(user)) {
			System.out.println("success");
			return "redirect:/home";
			}
		else {
			System.out.println("fail");
			return "redirect:/home";
		}
	}
	
	

	
	
	
}
