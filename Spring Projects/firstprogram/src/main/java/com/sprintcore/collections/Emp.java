package com.sprintcore.collections;

public class Emp {
	private int ePhones;
	private String eCources;
	private String eAddresses;
	public int getePhones() {
		return ePhones;
	}
	public void setePhones(int ePhones) {
		this.ePhones = ePhones;
	}
	public String geteCources() {
		return eCources;
	}
	public void seteCources(String eCources) {
		this.eCources = eCources;
	}
	public String geteAddresses() {
		return eAddresses;
	}
	public void seteAddresses(String eAddresses) {
		this.eAddresses = eAddresses;
	}
	@Override
	public String toString() {
		return "Emp [ePhones=" + ePhones + ", eCources=" + eCources + ", eAddresses=" + eAddresses + "]";
	}
	
	
}
