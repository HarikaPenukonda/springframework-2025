package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(@RequestParam("userName") String userName, @RequestParam("crushName") String crushName,
			Model model) {
		System.out.println("UserName is : " + userName + " and CrushName is : " + crushName);
		model.addAttribute("userName", userName);
		model.addAttribute("crushName", crushName);
		return "process-home";
	}

}
