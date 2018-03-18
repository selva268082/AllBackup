package com.virtusa.one2one.bidir.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
import com.virtusa.one2one.bidir.shardprikey.entity.Employee;
import com.virtusa.one2one.repo.DeltaEmployeeRepository;
import com.virtusa.one2one.repo.EmployeeRepository;

@Repository
@Transactional
public class OnetoOneMapBidirDAOImpl implements IOnetoOneMapBidirDAO {
    @Autowired
	EmployeeRepository empRepository; 
    
    @Autowired
 	DeltaEmployeeRepository dlempRepository; 
  
	@Override
	public void addSamePriKeyMappedObj(Employee employee) {
		 
		empRepository.save(employee); //save voter obj with vote obj in uni directional with same primary key column values
	
	}

 	@Override
	public void addForeignKeyMappedObj(DeltaEmployee dlemployeeObj) {
	 
 		dlempRepository.save(dlemployeeObj);
	}
/*
	@Override
	public List<Voter> fetchAllSamePriKeyObj() {
	  List<Voter> listOfVoters=new ArrayList();
	  voterRepository.findAll().forEach(listOfVoters::add);
      return listOfVoters;		
	}
	 */

}
