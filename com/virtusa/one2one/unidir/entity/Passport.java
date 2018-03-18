package com.virtusa.one2one.unidir.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="PASSPORT_DETAILS")
public class Passport {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PASSPORT_ID")
	private int id;
    private String passportIssBy;
    @JsonFormat(pattern="yyyy-mm-dd")
	private Date passportIssDate;
    @JsonFormat(pattern="yyyy-mm-dd")
	private Date passportExpDate;
	
	
	public String getPassportIssBy() {
		return passportIssBy;
	}
	public void setPassportIssBy(String passportIssBy) {
		this.passportIssBy = passportIssBy;
	}
	public Date getPassportIssDate() {
		return passportIssDate;
	}
	public void setPassportIssDate(Date passportIssDate) {
		this.passportIssDate = passportIssDate;
	}
	public Date getPassportExpDate() {
		return passportExpDate;
	}
	public void setPassportExpDate(Date passportExpDate) {
		this.passportExpDate = passportExpDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
}
