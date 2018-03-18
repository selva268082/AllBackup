package com.virtusa.dao;

import java.util.List;

import com.virtusa.entity.Customer;

public interface ICustomerDAO {
	
	public List<Customer> getAllCustomers();

	public void addCustomers(Customer cust);

}
