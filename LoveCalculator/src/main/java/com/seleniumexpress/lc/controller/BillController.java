package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.Bill;

@Controller
public class BillController {
	
	@RequestMapping("/bill")
	public String showBillPage(@ModelAttribute("billData") Bill bill) {
		return "my-bill-page";
	}
	
	@RequestMapping("/bill-sucess")
	public String billInfo(@ModelAttribute("billInfo") Bill bill) {
		return "bill-info-page";
	}

}
