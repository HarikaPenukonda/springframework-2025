package com.seleniumexpress.lc.api;

public class CreditCard {
	
	private Integer FirstFourDigits;
	
	private Integer SecoundFourDigits;
	
	private Integer ThirdFourDigits;
	
	private Integer FourthFourDigits;

	public Integer getFirstFourDigits() {
		return FirstFourDigits;
	}

	public void setFirstFourDigits(Integer firstFourDigits) {
		FirstFourDigits = firstFourDigits;
	}

	public Integer getSecoundFourDigits() {
		return SecoundFourDigits;
	}

	public void setSecoundFourDigits(Integer secoundFourDigits) {
		SecoundFourDigits = secoundFourDigits;
	}

	public Integer getThirdFourDigits() {
		return ThirdFourDigits;
	}

	public void setThirdFourDigits(Integer thirdFourDigits) {
		ThirdFourDigits = thirdFourDigits;
	}

	public Integer getFourthFourDigits() {
		return FourthFourDigits;
	}

	public void setFourthFourDigits(Integer fourthFourDigits) {
		FourthFourDigits = fourthFourDigits;
	}

	@Override
	public String toString() {
		return FirstFourDigits + "-" + SecoundFourDigits
				+ "-" + ThirdFourDigits + "-" + FourthFourDigits;
	}
	
	

}
