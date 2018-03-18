package com.virtusa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.dao.ICustomerDAO;
import com.virtusa.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDAO customerDAO;
	
	public List<Customer> getAllCustomers() {
		 
		return customerDAO.getAllCustomers();
	}

	@Override
	public void addCustomers(Customer cust) {
		customerDAO.addCustomers(cust);
		
	}
	
	
	

}
