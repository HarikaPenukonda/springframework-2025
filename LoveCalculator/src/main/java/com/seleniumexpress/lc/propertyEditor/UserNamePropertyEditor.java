package com.seleniumexpress.lc.propertyEditor;

import java.beans.PropertyEditorSupport;

public class UserNamePropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		 
		String upperCaseName = text.toUpperCase();
		System.out.println("userName  " + upperCaseName);
		setValue(upperCaseName);
	}
	

}
