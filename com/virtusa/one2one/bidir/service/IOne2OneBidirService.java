package com.virtusa.one2one.bidir.service;

import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
import com.virtusa.one2one.bidir.shardprikey.entity.Employee;

public interface IOne2OneBidirService {

	public void addSamePriKeyMappedObj(Employee employee);
	public void addForeignKeyMappedObj(DeltaEmployee dlemployee) ;
	/*public List<Voter> fetchAllSamePriKeyObj() ;*/
}
