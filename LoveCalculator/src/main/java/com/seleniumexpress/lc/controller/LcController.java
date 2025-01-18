package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage() {
		
		// read the default values from UserInfoDTO
		
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(UserInfoDTO userInfoDTO,Model model) {
		
		// writing the value to the properties by fetching from the url
		
		System.out.println("username : " + userInfoDTO.getUserName());
		System.out.println("crushName : " + userInfoDTO.getCrushName());
		model.addAttribute("userInfo", userInfoDTO);
		return "process-home";
	}

}
