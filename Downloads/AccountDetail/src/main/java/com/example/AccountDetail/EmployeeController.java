package com.example.AccountDetail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	@GetMapping(path="/all")
	@ResponseBody
	public String getCustomerDetails() {
	return "This is AccDeatails with Controller";
	}
	}


