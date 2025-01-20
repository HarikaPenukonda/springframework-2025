package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "result-page";
	}

}
