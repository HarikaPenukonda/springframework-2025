package com.seleniumexpress.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	// AbstractAnnotationConfigDispatcherServletInitializer is an abstract class

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {LoveCalculatorAppConfig.class};
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = {"/website.com/*"};
		return arr;
	}

}
