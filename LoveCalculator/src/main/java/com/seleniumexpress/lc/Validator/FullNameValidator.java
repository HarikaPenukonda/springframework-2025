package com.seleniumexpress.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

public class FullNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fullName", "fullName.empty", "full name must not be empty");
		
		String fullName = ((UserRegistrationDTO)object).getFullName();
		
		if(fullName.length() < 3 || fullName.length()>15) {
			errors.rejectValue("fullName", "fullName.invalid_length", "your name should be between 3 - 15 characters");
		}
	}

}
