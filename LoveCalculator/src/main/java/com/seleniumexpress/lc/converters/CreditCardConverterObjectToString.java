package com.seleniumexpress.lc.converters;

import org.springframework.core.convert.converter.Converter;

import com.seleniumexpress.lc.api.CreditCard;

public class CreditCardConverterObjectToString implements Converter<CreditCard, String> {

	@Override
	public String convert(CreditCard source) {
		
		return "Sample : " + source.getFourthFourDigits();
	}

}
