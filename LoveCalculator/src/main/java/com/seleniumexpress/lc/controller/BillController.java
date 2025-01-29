package com.seleniumexpress.lc.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.BillDTO;

@Controller
public class BillController {
	
	@RequestMapping("/bill")
	public String showBillPage(@ModelAttribute("billData") BillDTO billDTO) {
		System.out.println("<------inside the showBillPage method------>");
		
		return "my-bill-page";
	}
	
	@RequestMapping("/bill-success")
	public String billInfo(@ModelAttribute("billData") BillDTO billDTO, BindingResult result) {
		System.out.println("<------inside the billInfo method------>");
		if(result.hasErrors()) {
			System.out.println("Form has errors");
			System.out.println(result.getAllErrors());
			
			return "my-bill-page";
		}
		return "bill-info-page";
	}
	
	// Date Format 
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
		CustomDateEditor customDateEditor = new CustomDateEditor(simpleDateFormat, true);
		dataBinder.registerCustomEditor(Date.class, "date", customDateEditor);
	}
	
	// Custom Number Format
	@InitBinder
	public void initBinderAmount(WebDataBinder dataBinder) {
		
		NumberFormat numberFormat = new DecimalFormat("##,###.##");
		CustomNumberEditor customNumberEditor = new CustomNumberEditor(BigDecimal.class,numberFormat, true);
		dataBinder.registerCustomEditor(BigDecimal.class, "amount", customNumberEditor);
	}

}
