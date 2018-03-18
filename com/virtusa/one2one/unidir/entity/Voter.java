package com.virtusa.one2one.unidir.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
 

@Entity
@Table(name="VOTER_DETAILS")
public class Voter {
	
 /*@PrimaryKeyJoinColumn
  * which simply says that both the Address table and Student table share the same primary key.
    But how would you make sure to that Address class use the same id value as used by Student?
    You have to make sure in your code that you set the id of Address with the id of saved Student before 
    you save address(as we did in one-to-one unidirectional tutorial).If you don’t want to do that,
    another option is to use hibernate specific annotation @GenericGenerator (that’s what we are doing now in Address class).
    In Address class, @GenericGenerator ensures that id value of DeltaEmployee property value will be taken from the id of DeltaParkingLot table.
    Here DeltaParkingLot is the Parent object and DeltaEmployee is the Child object

  */
 
	@Id
	@GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign",parameters=@Parameter(name="property", value="vote"))
	@Column(name="VOTER_ID")
	private int id;
	private String voterFName;
	private String voterLName;
	private String voterAddress;

    @JsonFormat(pattern="yyyy-MM-dd")       
	private Date voterDOB;
	
	@OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn(referencedColumnName="VOTE_ID")
	private Vote vote;
	
	
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoterFName() {
		return voterFName;
	}
	public void setVoterFName(String voterFName) {
		this.voterFName = voterFName;
	}
	public String getVoterLName() {
		return voterLName;
	}
	public void setVoterLName(String voterLName) {
		this.voterLName = voterLName;
	}
	public String getVoterAddress() {
		return voterAddress;
	}
	public void setVoterAddress(String voterAddress) {
		this.voterAddress = voterAddress;
	}
	public Date getVoterDOB() {
		return voterDOB;
	}
	public void setVoterDOB(Date voterDOB) {
		this.voterDOB = voterDOB;
	}

}
