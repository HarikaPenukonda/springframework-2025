package com.seleniumexpress.lc.converters;

import java.util.Arrays;

import org.springframework.core.convert.converter.Converter;

import com.seleniumexpress.lc.api.CreditCard;

public class CreditCardConverterStringToObject implements Converter<String, CreditCard> {

	@Override
	public CreditCard convert(String source) {
		
		CreditCard creditCard = new CreditCard();

		// split the credit card number using '-'
		String[] creditCardArray = source.split("-");

		// convert String to Integer
		Integer[] integerArray = Arrays.stream(creditCardArray).map(Integer::parseInt).toArray(Integer[]::new);

		// Extract
		creditCard.setFirstFourDigits(integerArray[0]);
		creditCard.setSecoundFourDigits(integerArray[1]);
		creditCard.setThirdFourDigits(integerArray[2]);
		creditCard.setFourthFourDigits(integerArray[3]);

		System.out.println("Credit Card Info " + creditCard);

		return creditCard;
	}

}
