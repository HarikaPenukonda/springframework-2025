package com.seleniumexpress.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		// email should not be empty
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
		
		// email domain should be gmail.com
		String email = ((UserRegistrationDTO)object).getCommunicationDTO().getEmail();
		
		if(!email.contains("@gmail.com")) {
			errors.rejectValue("communicationDTO.email", "email.invalid_format");
		}
	}

}
