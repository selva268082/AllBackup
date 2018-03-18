package com.virtusa.one2one.unidir.service;

import java.util.List;

import com.virtusa.one2one.unidir.entity.Person;
import com.virtusa.one2one.unidir.entity.Voter;

public interface IOne2OneUnidirService {

	public void addSamePriKeyMappedObj(Voter voter);
	public void addForeignKeyMappedObj(Person personObj) ;
	public List<Voter> fetchAllSamePriKeyObj() ;
}
