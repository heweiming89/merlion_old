package org.together.merlion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerlionController {

	@GetMapping(value = { "/index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}

	@GetMapping(value = { "/login" })
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("/login");
		return mav;
	}

}
