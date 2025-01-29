package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

import org.springframework.format.Formatter;
import com.seleniumexpress.lc.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard>{

	@Override
	public String print(CreditCard object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditCard parse(String creditCardNumber, Locale locale) throws ParseException {
		
		System.out.println("<------inside the Parse method of CreditCardFromatter class------>");
		
		CreditCard creditCard = new CreditCard();
		
		// split the credit card number using '-'
		String[] creditCardArray = creditCardNumber.split("-");
		
		// convert String to Integer 
		Integer[] integerArray = Arrays.stream(creditCardArray)
			  .map(Integer::parseInt)
			  .toArray(Integer[]::new);
		
		// Extract 
		creditCard.setFirstFourDigits(integerArray[0]);
		creditCard.setSecoundFourDigits(integerArray[1]);
		creditCard.setThirdFourDigits(integerArray[2]);
		creditCard.setFourthFourDigits(integerArray[3]);
		
		System.out.println("Credit Card Info " + creditCard);
		
		return creditCard;
	}

}
