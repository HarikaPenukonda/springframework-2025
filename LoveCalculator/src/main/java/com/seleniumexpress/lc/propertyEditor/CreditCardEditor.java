package com.seleniumexpress.lc.propertyEditor;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

import com.seleniumexpress.lc.api.CreditCard;

public class CreditCardEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String creditCardNumber) throws IllegalArgumentException {

		CreditCard creditCard = new CreditCard();
		
		// split the credit card number using '-'
		String[] creditCardArray = creditCardNumber.split("-");

		// convert String to Integer
		Integer[] integerArray = Arrays.stream(creditCardArray).map(Integer::parseInt).toArray(Integer[]::new);

		// Extract
		creditCard.setFirstFourDigits(integerArray[0]);
		creditCard.setSecoundFourDigits(integerArray[1]);
		creditCard.setThirdFourDigits(integerArray[2]);
		creditCard.setFourthFourDigits(integerArray[3]);

		System.out.println("Credit Card Info " + creditCard);

	}

}
