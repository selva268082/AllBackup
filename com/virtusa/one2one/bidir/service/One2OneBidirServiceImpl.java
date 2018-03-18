package com.virtusa.one2one.bidir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.one2one.bidir.dao.IOnetoOneMapBidirDAO;
import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
import com.virtusa.one2one.bidir.shardprikey.entity.Employee;
import com.virtusa.one2one.unidir.dao.IOnetoOneMapUnidirDAO;
import com.virtusa.one2one.unidir.entity.Passport;
import com.virtusa.one2one.unidir.entity.Person;
import com.virtusa.one2one.unidir.entity.Voter;

@Service
public class One2OneBidirServiceImpl implements IOne2OneBidirService {

	@Autowired
    IOnetoOneMapBidirDAO onetoOneMapBidirDAO;
	
	@Override
	public void addSamePriKeyMappedObj(Employee employee) {
		onetoOneMapBidirDAO.addSamePriKeyMappedObj(employee);
		
	}

public void addForeignKeyMappedObj(DeltaEmployee deltaEmployee) {
		 
	onetoOneMapBidirDAO.addForeignKeyMappedObj(deltaEmployee);
	}

/*	@Override
	public List<Voter> fetchAllSamePriKeyObj() {
      	return	onetoOneMapUnidirDAO.fetchAllSamePriKeyObj();
		
	}*/
	
}
