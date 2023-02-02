package com.infotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloworldController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome(){
		return new ModelAndView("welcomePage", "welcomeMessage", "Welcome to Spring MVC World!!!");
	}
}
