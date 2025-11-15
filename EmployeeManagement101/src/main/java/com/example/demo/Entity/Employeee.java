package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employeee {
 @Id
	private int eID;
	private String name;
	private String address;
	private String email;
	private int moNo;
	
	

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMoNo() {
		return moNo;
	}

	public void setMoNo(int moNo) {
		this.moNo = moNo;
	}
	

}
