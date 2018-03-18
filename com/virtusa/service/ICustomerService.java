package com.virtusa.service;

import java.util.List;

import com.virtusa.entity.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomers();

	public void addCustomers(Customer cust);
}
