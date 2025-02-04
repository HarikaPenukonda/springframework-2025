package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.EmailDTO;

@Controller
public class EmailController {
	
	@RequestMapping("/sendemail")
	public String sendEmail(Model model) {
		
		
		model.addAttribute("emailDTO", new EmailDTO());

		//model.addAttribute("userName", userName.toUpperCase());
		return "send-email-page";
	}
	
	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailData") EmailDTO emailDTO) {
		return "process-email-page";
	}

}
