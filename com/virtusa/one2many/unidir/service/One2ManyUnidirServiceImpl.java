package com.virtusa.one2many.unidir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.one2many.unidir.dao.IOnetoManyMapUnidirDAO;
import com.virtusa.one2many.unidir.entity.SportsMan;
import com.virtusa.one2one.bidir.dao.IOnetoOneMapBidirDAO;
import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
import com.virtusa.one2one.unidir.dao.IOnetoOneMapUnidirDAO;
import com.virtusa.one2one.unidir.entity.Passport;
import com.virtusa.one2one.unidir.entity.Person;
import com.virtusa.one2one.unidir.entity.Voter;

@Service
public class One2ManyUnidirServiceImpl implements IOne2ManyUnidirService {

	@Autowired
    IOnetoManyMapUnidirDAO onetomanyMapUnidirDAO;
	
 
/*	
	@Override
	public void addSamePriKeyMappedObj(Voter voter) {
		onetoOneMapUnidirDAO.addSamePriKeyMappedObj(voter);
		
	}

	public void addForeignKeyMappedObj(Person personObj) {
		 
		onetoOneMapUnidirDAO.addForeignKeyMappedObj(personObj);
	}

	@Override
	public List<Voter> fetchAllSamePriKeyObj() {
      	return	onetoOneMapUnidirDAO.fetchAllSamePriKeyObj();
		
	}*/
	

	public void addForeignKeyMappedObj(SportsMan sportsMan) {
		 
		onetomanyMapUnidirDAO.addForeignMappedObj(sportsMan);
	}
	
}
