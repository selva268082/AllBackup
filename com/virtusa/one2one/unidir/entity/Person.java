package com.virtusa.one2one.unidir.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
 

@Entity
@Table(name="PERSON_DETAILS")
public class Person {
	
	//ID Generator specifically from hibernate  
/*	@GenericGenerator(name = "hilo-gen", strategy = "hilo") 
    @CollectionId(columns = { @Column }, generator = "hilo-gen", type = @Type(type="long"))*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PERSON_ID")
	private int id;
	private String personFName;
	private String personLName;
	private String personAddress;

    @JsonFormat(pattern="yyyy-MM-dd")       
	private Date personDOB;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="PERSON_PASSPORT_ID")
	private Passport passport;
	
	
 
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonFName() {
		return personFName;
	}
	public void setPersonFName(String personFName) {
		this.personFName = personFName;
	}
	public String getPersonLName() {
		return personLName;
	}
	public void setPersonLName(String personLName) {
		this.personLName = personLName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public Date getPersonDOB() {
		return personDOB;
	}
	public void setPersonDOB(Date personDOB) {
		this.personDOB = personDOB;
	}

}
