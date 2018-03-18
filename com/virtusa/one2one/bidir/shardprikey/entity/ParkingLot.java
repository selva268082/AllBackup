package com.virtusa.one2one.bidir.shardprikey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PARKING_LOT")
public class ParkingLot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PARKING_ID")
	private int id;
	private String parkingName;
	private String parkingNumber;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Employee employee;
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
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
