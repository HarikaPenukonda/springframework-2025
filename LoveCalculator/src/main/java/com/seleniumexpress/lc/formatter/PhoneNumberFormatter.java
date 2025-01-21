package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("<------inside the Print method of Parser Interfaceß------>");
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String phoneNumber, Locale locale) throws ParseException {
		
		System.out.println("<------inside the Parse method of Printer Interface------>");
		
		// split the string received from the user
		String[] phoneNumberArray = phoneNumber.split("-");
		
		// Extract the country code and set it to Phone class country code property
		Phone phone = new Phone();
		phone.setCountryCode(phoneNumberArray[0]);
		phone.setUserNumber(phoneNumberArray[1]);
		
		return phone;
	}

}
