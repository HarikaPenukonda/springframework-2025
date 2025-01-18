package com.seleniumexpress.lc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		
		// create dispatcher servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register dispatcher servlet with servlet context
		ServletRegistration.Dynamic customServlet =  servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		// setting load-on-startup
		customServlet.setLoadOnStartup(1);
		
		// setting url mapping
		customServlet.addMapping("/website.com/*");
	}	

}
