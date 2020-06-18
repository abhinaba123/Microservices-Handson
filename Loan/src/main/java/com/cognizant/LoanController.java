package com.cognizant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController 
{
	@GetMapping("/loans/{number}")
	public String getLoanDetails(@PathVariable String number)
	{
		String str = "Number: "+number+", Type:Car, Loan: 400000, EMI: 3258, Tenure: 18";
		return str;
	}
}
