package com.springcore.auto.wire;

public class Emp {
	private Address address;

	public Emp() {
		
	}

	public Emp(Address address) {
		super();
		System.out.println("Inside constructor");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	

}
