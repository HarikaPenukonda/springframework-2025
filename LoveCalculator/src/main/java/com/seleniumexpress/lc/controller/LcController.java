package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(@RequestParam String userName, @RequestParam String crushName) {
		return "process-home";
	}

}
