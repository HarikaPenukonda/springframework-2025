package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userInfo") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("<------inside the show registration page method------>");
		
		// load the saved user from the database(example) for now will do manually
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("8729472930");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		// CommunicationDTO() is null so will get NPE, create the object
		//userRegistrationDTO.getCommunicationDTO().setPhone(phone);
		
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		
		
		return "user-registration-page";
	}
	
	@RequestMapping("/register-success")
	public String registeredUserInfo(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("<------inside the registered User information method------>");
		return "register-user-info";
	}

}
