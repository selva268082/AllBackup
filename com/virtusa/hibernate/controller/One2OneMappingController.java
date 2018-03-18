package com.virtusa.hibernate.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.one2many.unidir.entity.SportsMan;
import com.virtusa.one2many.unidir.service.IOne2ManyUnidirService;
import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
import com.virtusa.one2one.bidir.service.IOne2OneBidirService;
import com.virtusa.one2one.bidir.shardprikey.entity.Employee;
import com.virtusa.one2one.unidir.entity.Passport;
import com.virtusa.one2one.unidir.entity.Person;
import com.virtusa.one2one.unidir.entity.Voter;
import com.virtusa.one2one.unidir.service.IOne2OneUnidirService;

@RestController
@RequestMapping("/onetoone")
public class One2OneMappingController {
	
	@Autowired
	IOne2OneUnidirService one2OneUnidirService;
	
	@Autowired
	IOne2OneBidirService one2OneBidirService;

     
	@RequestMapping("/unidir/samekey")
	public String addUnidirSamePrimaryKey(@RequestBody Voter voter){
		one2OneUnidirService.addSamePriKeyMappedObj(voter);
		return "Added successfully!!";
	}
	  
	@RequestMapping("/unidir/diffkey")
	public String addUnidirDiffPrimaryKey(@RequestBody Person personObj){
		one2OneUnidirService.addForeignKeyMappedObj(personObj);
		return "Added successfully!!";
		}
		
	@RequestMapping("/unidir/samekey/fetchall")
	public List<Voter> fetchAllUnidirSamePrimaryKey(){
		return one2OneUnidirService.fetchAllSamePriKeyObj();
		}
	
	
	@RequestMapping("/bidir/samekey")
	public String addBidirSamePrimaryKey(@RequestBody Employee employee){
		one2OneBidirService.addSamePriKeyMappedObj(employee);
		return "Added successfully!!";
	}
	  
	@RequestMapping("/bidir/diffkey")
	public String addBidirDiffPrimaryKey(@RequestBody DeltaEmployee dlemployee){
		one2OneBidirService.addForeignKeyMappedObj(dlemployee);
		return "Added successfully!!";
	}
	 
	

}
