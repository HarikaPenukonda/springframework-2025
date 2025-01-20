package com.seleniumexpress.lc.api;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = " * your name should not be blank")
	//@Min(value = 2, message = "* username should be atleast 3 letters")
	@Size(min = 3, max = 15, message = "* your name should be between 3 - 15 characters")
	private String userName;
	
	private String crushName;
	
	@AssertTrue(message = "* you need to accept terms and conditions")
	private boolean termsAndConditions;

	public UserInfoDTO() {
		System.out.println("UserInfoDTO constructor is called...");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
	
	

}
