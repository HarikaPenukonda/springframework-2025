package com.seleniumexpress.lc.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidatorConstraint implements ConstraintValidator<Age, Integer>{
	
	private int lower; // 30
	
	private int upper; // 75
	
	@Override
	public void initialize(Age age) {
		// for initializing and post construct work
		this.lower = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// To write our business logic
		if(age == null) {
			return false; // fail
		}
		else if(age < 30 || age > 75) {
			return false;	//fail
		}
		return true;	//pass
	}

}
