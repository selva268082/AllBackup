package com.virtusa.one2one.unidir.dao;

import java.util.List;

import com.virtusa.one2one.unidir.entity.Person;
import com.virtusa.one2one.unidir.entity.Voter;


public interface IOnetoOneMapUnidirDAO {
		public void addSamePriKeyMappedObj(Voter voter); //Join shared same primary key column VOTER->VOTE
		public void addForeignKeyMappedObj(Person person); //Join Foreign key column VOTER->VOTE
		public List<Voter> fetchAllSamePriKeyObj();
}
