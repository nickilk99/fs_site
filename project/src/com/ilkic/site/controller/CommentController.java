package com.ilkic.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.CommentEntity;
import com.ilkic.site.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService commentservice;

	@RequestMapping(value = "editComment")
	public ModelAndView editComment(@RequestParam("commentId") int postid) {
		ModelAndView mv = new ModelAndView("update-comment");
		CommentEntity newComment = new CommentEntity(postid);
		mv.addObject("newComment", newComment);

		return mv;
	}

	@RequestMapping(value = "updateComment")
	public String updateComment(@ModelAttribute("comment") CommentEntity comment) {
		if (commentservice.addComment(comment)) {
			return "redirect:/posts/" + comment.getPost().getId();
		} else {
			return "ErrorPage";
		}
	}

}
