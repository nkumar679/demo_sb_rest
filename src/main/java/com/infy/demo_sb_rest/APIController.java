package com.infy.demo_sb_rest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	@RequestMapping(method={RequestMethod.GET},value={"/customer"})
	public Customer getCustomer(HttpServletResponse httpServletResponse){
		return new Customer("Narender", "Maurya", "425623219580", "Pune");
		
	}
	
	
}
