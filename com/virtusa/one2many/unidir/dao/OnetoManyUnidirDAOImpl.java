package com.virtusa.one2many.unidir.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.one2many.repo.SportsManRepository;
import com.virtusa.one2many.unidir.entity.SportsMan;
import com.virtusa.one2one.repo.PassportRepository;
import com.virtusa.one2one.repo.VoterRepository;
import com.virtusa.one2one.unidir.entity.Passport;
import com.virtusa.one2one.unidir.entity.Person;
import com.virtusa.one2one.unidir.entity.Voter;

@Repository
@Transactional
public class OnetoManyUnidirDAOImpl implements IOnetoManyMapUnidirDAO {
    @Autowired
	SportsManRepository sportsManRepository; 
 
	@Override
	public void addForeignMappedObj(SportsMan sportsMan) {
		 
		sportsManRepository.save(sportsMan); //save voter obj with vote obj in uni directional with same primary key column values
	
	}

	/*@Override
	public void addForeignKeyMappedObj(Person personObj) {
	 
		passportRepository.save(personObj);
	}

	@Override
	public List<Voter> fetchAllSamePriKeyObj() {
	  List<Voter> listOfVoters=new ArrayList();
	  voterRepository.findAll().forEach(listOfVoters::add);
      return listOfVoters;		
	}
	 */

}
