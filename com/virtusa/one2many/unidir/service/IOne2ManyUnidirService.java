package com.virtusa.one2many.unidir.service;

import com.virtusa.one2many.unidir.entity.SportsMan;

public interface IOne2ManyUnidirService {

	public void addForeignKeyMappedObj(SportsMan sportsMan);
/*	public void addForeignKeyMappedObj(Person personObj) ;
	public List<Voter> fetchAllSamePriKeyObj() ;*/
}
