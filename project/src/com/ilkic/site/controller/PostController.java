package com.ilkic.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.PostEntity;
import com.ilkic.site.service.PostService;

@Controller
public class PostController {

	@Autowired
	PostService service;
	
	
	@RequestMapping("/post")
	public ModelAndView createPost() {
		ModelAndView modelView = new ModelAndView("post");
		modelView.addObject("post", new PostEntity());
		return modelView;
	}


	@RequestMapping(value = "/getposts", method = RequestMethod.GET)
	public ModelAndView getUsersList() {
		ModelAndView modelView = new ModelAndView("post-list");

		List<PostEntity> posts = service.getPosts();
		modelView.addObject("postList", posts);
		modelView.addObject("post", new PostEntity());

		return modelView;
	}
	
	@RequestMapping(value = "createPost", method = RequestMethod.POST)
	public String createPost(@ModelAttribute("post") PostEntity post) {
		if (service.addPost(post)) {
			System.out.println("success");
			return "redirect:/home";
			}
		else {
			System.out.println("fail");
			return "redirect:/home";
		}
	}
	
}
