package com.seleniumexpress.lc.api;

public class BillDTO {
	
	private String userName;
	
	private CreditCard creditCard;
	
	private Amount amount;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	
	
	

}
