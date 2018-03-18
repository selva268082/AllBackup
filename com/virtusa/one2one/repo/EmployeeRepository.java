package com.virtusa.one2one.repo;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.one2one.bidir.shardprikey.entity.Employee;
 

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
