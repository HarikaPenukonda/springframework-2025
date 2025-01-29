package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public String billInfo(@ModelAttribute("billInfo") BillDTO billDTO, BindingResult result) {
		System.out.println("<------inside the billInfo method------>");
		if(result.hasErrors()) {
			System.out.println("Form has errors");
			System.out.println(result.getAllErrors());
		}
		return "bill-info-page";
	}
	
	
	public void initBinder() {
		
	}

}
