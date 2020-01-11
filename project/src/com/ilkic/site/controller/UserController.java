package com.ilkic.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	
	
	
}
