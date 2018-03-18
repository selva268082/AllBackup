package com.virtusa.one2one.bidir.foriegnkey.entity;

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
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
 

@Entity
@Table(name="DELTA_EMP_DETAILS")
public class DeltaEmployee {
	
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DELTA_EMPLOYEE_ID")
	private int id;
	private String empFName;
	private String empLName;
	private String empAddress;

    @JsonFormat(pattern="yyyy-MM-dd")       
	private Date empDOB;
	
	@OneToOne(cascade=CascadeType.ALL)
    //@PrimaryKeyJoinColumn(referencedColumnName="PARKING_ID")//only used for shared primarykey situatuin
	@JoinColumn(name="EMP_PARKING_ID")
	private DeltaParkingLot parkinglot;
	
	
	public DeltaParkingLot getParkinglot() {
		return parkinglot;
	}
	public void setParkinglot(DeltaParkingLot parkinglot) {
		this.parkinglot = parkinglot;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpLName() {
		return empLName;
	}
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}

}
