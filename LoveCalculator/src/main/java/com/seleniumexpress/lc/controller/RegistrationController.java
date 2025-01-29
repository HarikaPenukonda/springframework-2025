package com.seleniumexpress.lc.controller;

import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;
import com.seleniumexpress.lc.propertyEditor.UserNamePropertyEditor;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
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
			System.out.println(allErrors);
			return "user-registration-page";
		}
		return "register-user-info";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("<------inside the initBinder method------>");
		//binder.setDisallowedFields("userName");
		// inbuit class to trim white spaces
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "userName", editor);
		
		UserNamePropertyEditor userNamePropertyEditor = new UserNamePropertyEditor();
		binder.registerCustomEditor(String.class,"userName",userNamePropertyEditor);
		
	}

}















