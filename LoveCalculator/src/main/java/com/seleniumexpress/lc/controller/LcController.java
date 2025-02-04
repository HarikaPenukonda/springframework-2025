package com.seleniumexpress.lc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumexpress.lc.api.UserInfoDTO;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("userInfo") // stores multiple attributes/objects to the session
public class LcController {
	
	@RequestMapping("/")
	public String getHomePage(Model model) {
		
		// public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO)
		// we are telling spring to store userInfoDTO or userInfo model attribute inside the session
		// Spring will save userInfo, but we need to add userInfo to model manually
		
		model.addAttribute("userInfo", new UserInfoDTO()); // adding manually
		return "home-page";
	}
	
	@RequestMapping("/processhome")
	public String processHomePage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) 
	{	
		//System.out.println(userInfoDTO.isTermsAndConditions());
		
		if(result.hasErrors()) {
			System.out.println("Form has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			System.out.println(allErrors);
			// Field error in object 'userInfo' on field 'userName': rejected value []; 
			// codes [NotBlank.userInfo.userName,NotBlank.userName,NotBlank.java.lang.String,NotBlank]; 
			// arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [userInfo.userName,userName]; 
			// arguments []; default message [userName]]; default message [username should not be blank]]
			return "home-page";
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
