package com.seleniumexpress.lc.api;

import jakarta.validation.Valid;


public class CommunicationDTO {
	
	private String email = "myexample@gmail.com";
	
	
	@Valid
	private Phone phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	
	

}
