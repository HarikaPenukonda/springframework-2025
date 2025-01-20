package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(Model model) {
		UserRegistrationDTO dto = new UserRegistrationDTO();
		model.addAttribute("userInfo", dto);
		return "user-registration-page";
	}

}
