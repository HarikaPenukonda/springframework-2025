package com.seleniumexpress.lc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seleniumexpress.lc.converters.CreditCardConverterStringToObject;
import com.seleniumexpress.lc.formatter.CreditCardFormatter;
import com.seleniumexpress.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.lc.controller")
public class LoveCalculatorAppConfig implements WebMvcConfigurer{
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	// To load the property file spring provides an Interface MessageSource
	// Define MessageSource
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
		resourceBundleMessageSource.addBasenames("messages");
		
		return resourceBundleMessageSource;
	}
	
	// To inform spring that will be using messages.properties file to set validation error messages
	// Register `MessageSource` with Spring
	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;
		
	}
	
	// Define Validator
	@Override
	public Validator getValidator() {
		return localValidatorFactoryBean();
	}
	
	
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		//System.out.println("<------inside the addFormatter method------>");
		registry.addFormatter(new PhoneNumberFormatter());
		
		//registry.addFormatter(new CreditCardFormatter());
		registry.addConverter(new CreditCardConverterStringToObject());
	}

}
