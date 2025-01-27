package com.seleniumexpress.lc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;

import jakarta.validation.Valid;

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
	public String registeredUserInfo(@Valid @ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO , BindingResult result) {
		System.out.println("<------inside the registered User information method------>");
		if(result.hasErrors()) {
			System.out.println("<------Page has errors------>");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError);
			}
		}
		return "register-user-info";
	}

}
