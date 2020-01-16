package com.ilkic.site.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.CommentEntity;
import com.ilkic.site.model.PostEntity;
import com.ilkic.site.service.CommentService;
import com.ilkic.site.service.PostService;
import com.ilkic.site.service.UserService;

@Controller
public class PostController {

	@Autowired
	PostService service;
	@Autowired
	UserService userservice;
	@Autowired
	CommentService commentservice;

	
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
		Collections.reverse(posts);

		modelView.addObject("postList", posts);

		return modelView;
	}
	
	@RequestMapping(value = "createPost", method = RequestMethod.POST)
	public String createPost(@ModelAttribute("post") PostEntity post ) {
//		int authorid = (int) request.getAttribute("authorid");
//		post.setAuthor(userservice.getUserById(authorid));
//		post.setAuthor(userservice.getUserById(userId));
		if (service.addPost(post)) {
			
			System.out.println("success");
			return "redirect:/posts/"+ post.getId();
			}
		else {
			System.out.println("fail");
			return "redirect:/home";
		}
	}
	
	
	// ..../testconfigproject/students/student/Alex
	// Alex would be passed via path variable
	@RequestMapping(value = "/posts/{post}", method = RequestMethod.GET)
	public ModelAndView getPost(@PathVariable("post") int postId) {
		ModelAndView modelView = new ModelAndView("post-view");
		PostEntity singlepost = service.getPostById(postId);
		List<CommentEntity> comments = commentservice.getCommentsByPostId(postId);
		
		modelView.addObject("singlePost", singlepost);
		modelView.addObject("commentList", comments);
		modelView.addObject("commentform", new CommentEntity());
		
		
		
		


		return modelView;
	}
	
	

	
	
	
	
	
	
	
	@RequestMapping(value = "deletepost")
	public String deletePost(@RequestParam("postId") int postId) {
		if (service.deletePost(postId)) {
			return "redirect:/getposts";
		}
		else {
			return "ErrorPage";
		}
	}
	
	
	@RequestMapping(value = "editpost")
	public ModelAndView editPost(@RequestParam("postId") int postId) {
		ModelAndView mv = new ModelAndView("update-post");
		PostEntity fetchedPost = service.getPostById(postId);
		mv.addObject("editedpost", fetchedPost);
		return mv;
	}

	@RequestMapping(value = "updatePost")
	public String updatePost(@ModelAttribute("post") PostEntity post) {
		if (service.updatePost(post)) {
			return "redirect:/getposts";
		} else {
			return "ErrorPage";
		}
	}
	
	
	
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
		    return "redirect:/posts/"+ comment.getPost().getId();
		} else {
			return "ErrorPage";
		}
	}
	
}
