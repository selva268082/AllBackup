package com.virtusa.one2many.unidir.dao;

import com.virtusa.one2many.unidir.entity.SportsMan;


public interface IOnetoManyMapUnidirDAO {
		public void addForeignMappedObj(SportsMan sportsman); //Join shared same primary key column VOTER->VOTE
	/*	public void addForeignKeyMappedObj(Person person); //Join Foreign key column VOTER->VOTE
		public List<Voter> fetchAllSamePriKeyObj();*/
}
