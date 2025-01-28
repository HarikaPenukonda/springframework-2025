package com.seleniumexpress.lc.api;

import com.seleniumexpress.lc.Validator.PhoneValidator;

public class Phone {
	
	
	private String countryCode;
	
	@PhoneValidator
	private String userNumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return countryCode + "-" + userNumber;
	}
	
	

}
