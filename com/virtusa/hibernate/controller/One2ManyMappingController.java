package com.virtusa.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.one2many.unidir.entity.SportsMan;
import com.virtusa.one2many.unidir.service.IOne2ManyUnidirService;

@RestController
@RequestMapping("/onetomany")
public class One2ManyMappingController {
	
	@Autowired
	IOne2ManyUnidirService one2manyUnidirService;
	@RequestMapping("/unidir/diffkey")
	public String addUnidir(@RequestBody SportsMan sportsman){
		one2manyUnidirService.addForeignKeyMappedObj(sportsman);
		return "Added successfully!!";
	}
}
