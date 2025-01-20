package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.lc.api.UserInfoDTO;

import jakarta.validation.Valid;

@Controller
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) 
	{	
		if(result.hasErrors()) {
			System.out.println("Form has errors");
		}
		
		/*
		 * the @Valid annotation is used to trigger validation for a bean or object
		 * based on the constraints defined in the bean's class. It is part of the Bean
		 * Validation API (JSR 303 and JSR 380).
		 */
		/*
		 * BindingResult is an interface used to capture and manage the result of
		 * validation. It holds the outcome of binding input data to an object and
		 * provides access to validation errors if any constraints are violated.
		 */
		return "result-page";
	}

}
