package com.seleniumexpress.lc.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneValidatorConstraint implements ConstraintValidator<PhoneValidator, String>{
	
	
	@Override
	public void initialize(PhoneValidator phoneValidator) {
		
	}

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
		if(phoneNumber == null || phoneNumber.isEmpty()) {
			return false; // fail : Null or empty is considered invalid
		}
//		String[] parts = phoneNumber.split("-");
//		if(parts.length != 2) {
//			return false; // fail : Format should be countryCode-userNumber
//		}
//		String userNumber = parts[1];
//		String countryCode = parts[0];
		if(!phoneNumber.matches("\\d{10}")) {
			return false;
		}
		return true; // pass: Check if userNumber is exactly 10 digits
			
		
	}

}
