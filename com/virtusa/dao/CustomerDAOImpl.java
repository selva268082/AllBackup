package com.virtusa.dao;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.virtusa.entity.Customer;
import com.virtusa.repo.CustomerRepository;

@Repository
@Transactional
public class CustomerDAOImpl implements ICustomerDAO {
	
	@Autowired
	CustomerRepository custRepo;

	public List<Customer> getAllCustomers() {
	    List<Customer> custLst=new ArrayList<Customer>();
	    custRepo.findAll().forEach(custLst::add);
		return custLst;
	}

	@Override
	public void addCustomers(Customer cust) {
		custRepo.save(cust);
		
	}

}
