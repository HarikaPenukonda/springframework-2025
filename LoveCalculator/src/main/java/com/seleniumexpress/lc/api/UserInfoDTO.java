package com.seleniumexpress.lc.api;

import jakarta.validation.constraints.NotBlank;

public class UserInfoDTO {
	
	@NotBlank(message = "username should not be blank")
	private String userName;
	
	private String crushName;
	
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

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
	
	

}
