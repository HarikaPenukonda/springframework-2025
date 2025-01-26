package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
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
	public String billInfo(@ModelAttribute("billInfo") BillDTO billDTO) {
		System.out.println("<------inside the billInfo method------>");
		System.out.println(billDTO.getUserName());
		System.out.println(billDTO.getCreditCard());
		return "bill-info-page";
	}

}
