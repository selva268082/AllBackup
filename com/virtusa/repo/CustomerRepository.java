package com.virtusa.repo;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
