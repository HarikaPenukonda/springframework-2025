package com.seleniumexpress.lc.api;

public class CreditCard {
	
	private Integer firstFourDigits = 1234;
	
	private Integer secoundFourDigits = 1234;
	
	private Integer thirdFourDigits = 1234;
	
	private Integer fourthFourDigits = 1234;

	public Integer getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(Integer firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public Integer getSecoundFourDigits() {
		return secoundFourDigits;
	}

	public void setSecoundFourDigits(Integer secoundFourDigits) {
		this.secoundFourDigits = secoundFourDigits;
	}

	public Integer getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(Integer thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	public Integer getFourthFourDigits() {
		return fourthFourDigits;
	}

	public void setFourthFourDigits(Integer fourthFourDigits) {
		this.fourthFourDigits = fourthFourDigits;
	}

	@Override
	public String toString() {
		return firstFourDigits + "-" + secoundFourDigits
				+ "-" + thirdFourDigits + "-" + fourthFourDigits;
	}
	
	
	

}
