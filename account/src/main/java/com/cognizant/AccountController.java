package com.cognizant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController 
{
	@GetMapping("/accounts/{number}")
	public String getAccountDetails(@PathVariable String number)
	{
		String str="number: "+number+", type: Savings ,balance: 234343";
		return str;
	}
}
