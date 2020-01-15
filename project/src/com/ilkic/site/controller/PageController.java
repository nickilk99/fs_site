package com.ilkic.site.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.UserEntity;
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
	
	@RequestMapping("/register")
	public ModelAndView goRegister() {
		ModelAndView modelView = new ModelAndView("registration");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}
	
	
//make it so you can see any user here
//	// ..../testconfigproject/students/student/Alex
//	// Alex would be passed via path variable
//	@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
//	public ModelAndView getStudent(@PathVariable("name") String studentName) {
//		ModelAndView modelView = new ModelAndView("student");
//		modelView.addObject("studentName", studentName);
//
//		return modelView;
//	}
	
	@RequestMapping("/testmethod")
	public ModelAndView goTest(HttpSession session) {
		ModelAndView modelView = new ModelAndView("index");
		System.out.println(session.getAttribute("UserEntity"));
		UserEntity user = (UserEntity)session.getAttribute("UserEntity");
		System.out.println(user.getName());
		return modelView;
	}
	
	
	
}
