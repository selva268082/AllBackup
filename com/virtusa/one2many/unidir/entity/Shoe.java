package com.virtusa.one2many.unidir.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="SHOE")
public class Shoe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String shoeType;
	private String shoeCompanyName;
	@JsonFormat
	private int shoeSize;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="SPORTSMAN_ID")//bi directional - remove for unidirectional
	private SportsMan sportsMan;
	
	
	public SportsMan getSportsMan() {
		return sportsMan;
	}
	public void setSportsMan(SportsMan sportsMan) {
		this.sportsMan = sportsMan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShoeType() {
		return shoeType;
	}
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}
	public String getShoeCompanyName() {
		return shoeCompanyName;
	}
	public void setShoeCompanyName(String shoeCompanyName) {
		this.shoeCompanyName = shoeCompanyName;
	}
	public int getShoeSize() {
		return shoeSize;
	}
	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}
    
	

}
