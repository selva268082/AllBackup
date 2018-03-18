package com.virtusa.one2many.unidir.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
 

@Entity
@Table(name="SPORTSMAN")
public class SportsMan {
	
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
	
	@OneToMany(mappedBy="sportsMan",cascade=CascadeType.ALL) //bidirectional
    //@JoinColumn(name="PERSON_PASSPORT_ID") //uni directional 
	private List<Shoe> shoe;
	
 
	public List<Shoe> getShoe() {
		return shoe;
	}
	public void setShoe(List<Shoe> shoe) {
		this.shoe = shoe;
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
