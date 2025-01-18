package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage() {
		return "process-home";
	}

}
