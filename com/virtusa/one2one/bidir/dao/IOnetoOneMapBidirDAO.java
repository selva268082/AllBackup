package com.virtusa.one2one.bidir.dao;

import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
import com.virtusa.one2one.bidir.shardprikey.entity.Employee;


public interface IOnetoOneMapBidirDAO {
		public void addSamePriKeyMappedObj(Employee employee); //Join shared same primary key column VOTER->VOTE
		public void addForeignKeyMappedObj(DeltaEmployee dlemployee); //Join Foreign key column VOTER->VOTE
		/*	public List<Voter> fetchAllSamePriKeyObj();*/
}
