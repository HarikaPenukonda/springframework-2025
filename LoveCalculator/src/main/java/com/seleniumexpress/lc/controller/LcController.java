package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		
		// writing the value to the properties by fetching from the url
		
//		System.out.println("username : " + userInfoDTO.getUserName());
//		System.out.println("crushName : " + userInfoDTO.getCrushName());
//		model.addAttribute("userInfo", userInfoDTO);
		return "process-home";
	}

}
