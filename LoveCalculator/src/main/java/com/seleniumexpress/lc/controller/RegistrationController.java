package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(Model model) {
		System.out.println("<------inside the show registration page method------>");
		UserRegistrationDTO dto = new UserRegistrationDTO();
		model.addAttribute("userInfo", dto);
		return "user-registration-page";
	}
	
	@RequestMapping("/register-success")
	public String registeredUserInfo(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("<------inside the registered User information method------>");
		return "register-user-info";
	}

}
