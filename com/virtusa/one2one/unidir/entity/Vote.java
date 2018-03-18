package com.virtusa.one2one.unidir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VOTE_DETAILS")
public class Vote {
    @Id
    @GeneratedValue
	@Column(name="VOTE_ID")
	private int id;
	private String partyName;
	private String partyCandidateName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getPartyCandidateName() {
		return partyCandidateName;
	}
	public void setPartyCandidateName(String partyCandidateName) {
		this.partyCandidateName = partyCandidateName;
	}
	
}
