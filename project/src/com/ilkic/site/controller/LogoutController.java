package com.ilkic.site.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {

	@RequestMapping()
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
}