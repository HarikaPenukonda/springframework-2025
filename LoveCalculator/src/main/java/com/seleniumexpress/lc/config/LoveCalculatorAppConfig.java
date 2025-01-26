package com.seleniumexpress.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		//System.out.println("<------inside the addFormatter method------>");
		registry.addFormatter(new PhoneNumberFormatter());
		System.out.println("<------inside the CreditCard addFormatter method------>");
		registry.addFormatter(new CreditCardFormatter());
	}

}
