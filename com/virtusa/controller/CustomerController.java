package com.virtusa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.entity.Customer;
import com.virtusa.service.ICustomerService;

@RestController
@RequestMapping(value="/cust")
public class CustomerController {
	
	@Autowired 
	ICustomerService custService;
	
	@RequestMapping(value="/custdetails",method=RequestMethod.GET)
	public List<Customer> getAllCustomers()
	{
		return custService.getAllCustomers();
		
	}
	
	@RequestMapping(value="/custdetails",method=RequestMethod.POST)
	public String addCustomerDetails(@RequestBody Customer cust)
	{
		custService.addCustomers(cust);
		return  "Customer Added Successfully!";
		
	}
	

}
