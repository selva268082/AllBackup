package com.virtusa.one2one.bidir.foriegnkey.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="DELTA_PARKING_LOT")
public class DeltaParkingLot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DELTA_PARKING_ID")
	private int id;
	private String parkingName;
	private String parkingNumber;
	
	@OneToOne(mappedBy="parkinglot",cascade=CascadeType.ALL)
	//@PrimaryKeyJoinColumn
	private DeltaEmployee employee;
	
	
	public DeltaEmployee getEmployee() {
		return employee;
	}
	public void setEmployee(DeltaEmployee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParkingName() {
		return parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}
	public String getParkingNumber() {
		return parkingNumber;
	}
	public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}
	
}
