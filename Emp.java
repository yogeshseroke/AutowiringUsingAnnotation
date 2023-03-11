package com.autowiringPracticeUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter method");
		this.address = address;
	}
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
