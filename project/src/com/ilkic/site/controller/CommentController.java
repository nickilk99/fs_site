package com.ilkic.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.CommentEntity;
import com.ilkic.site.service.CommentService;

@Controller
public class CommentController {
	
	@Autowired
	CommentService commentservice;

	
	@RequestMapping(value = "createComment", method = RequestMethod.POST)
	public String createComment(@ModelAttribute("comment") CommentEntity comment ) {

		if (commentservice.addComment(comment)) {
			
			System.out.println("success");
			return "redirect:/home";
			}
		else {
			System.out.println("fail");
			return "redirect:/home";
		}
	}

	@RequestMapping("/comment")
	public ModelAndView createComment() {
		ModelAndView modelView = new ModelAndView("comment");
		modelView.addObject("comment", new CommentEntity());
		return modelView;
	}
	
}
