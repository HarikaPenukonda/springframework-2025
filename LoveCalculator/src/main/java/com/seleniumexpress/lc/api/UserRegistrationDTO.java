package com.seleniumexpress.lc.api;

import com.seleniumexpress.lc.Validator.Age;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserRegistrationDTO {
	
	//@NotBlank(message = " * your name should not be blank")
	//@Size(min = 3, max = 15, message = "* your name should be between 3 - 15 characters")
	private String fullName;
	
	@NotEmpty(message = " * username cannot be empty")
	private String userName;
	
	private char[] password;
	
	private String country;
	
	private String[] hobbies;
	
	private String gender;
	
	@Age(lower = 30, upper = 75)
	private Integer age;
	
	@Valid
	private CommunicationDTO communicationDTO;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
