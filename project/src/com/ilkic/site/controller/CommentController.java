package com.ilkic.site.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.ilkic.site.model.CommentEntity;
import com.ilkic.site.service.CommentService;

@Controller
public class CommentController {
	
	
	
	@Autowired
	CommentService commentservice;

	
	@PostMapping(value = "createComment")
	@ResponseStatus(value=HttpStatus.OK)
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
	
	
	@RequestMapping("/commentpost")
	public ModelAndView createComment2() {
		ModelAndView modelView = new ModelAndView("comment");
		modelView.addObject("comment", new CommentEntity());
		return modelView;
	}
	
	
	// ..../testconfigproject/students/student/Alex
	// Alex would be passed via path variable
	@RequestMapping(value = "/test/{test}", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView getPost(@PathVariable("test") int test, @ModelAttribute("commentform")CommentEntity commententity) {
		ModelAndView modelView = new ModelAndView("testGet");
		
		CommentEntity comment = new CommentEntity();
		modelView.addObject("commentform", comment);
		

		modelView.addObject("test", test);
		
		
		
		


		return modelView;
	}
	
	
	
	// ..../testconfigproject/students/student/Alex
	// Alex would be passed via path variable
	@RequestMapping(value = "/test/post", method = RequestMethod.POST)
	public ModelAndView getPost(@ModelAttribute("commentform")CommentEntity commententity) {
		ModelAndView modelView = new ModelAndView("testGet");
		
		CommentEntity comment = new CommentEntity();
		modelView.addObject("commentform", comment);
		

		
		
		
		


		return modelView;
	}
	
	
	
	   @RequestMapping(value = "/posttest", method = RequestMethod.POST)
	    public String controllerMethod(HttpServletRequest request){  
	        // this way you get value of the input you want
	        String pathValue1 = request.getParameter("path1");
	        System.out.println(pathValue1);
	        return "successfulView";
	    }
	
	
	
	
	
	
	
}
