package com.seleniumexpress.lc.Validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = PhoneValidatorConstraint.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PhoneValidator {
	
	int size() default 10;
	
	String message() default "Invalid Phone Number. User number should be exactly 10 digits";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
