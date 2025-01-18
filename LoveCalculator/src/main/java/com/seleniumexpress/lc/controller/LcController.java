package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(UserInfoDTO userInfoDTO,Model model) {
		System.out.println("username : " + userInfoDTO.getUserName());
		System.out.println("crushName : " + userInfoDTO.getCrushName());
		model.addAttribute("userInfo", userInfoDTO);
//		System.out.println("UserName is : " + userName + " and CrushName is : " + crushName);
//		model.addAttribute("userName", userName);
//		model.addAttribute("crushName", crushName);
		return "process-home";
	}

}
