package com.spring.jdbc;

public class Student {
	private int sId;
	private String sName;
	private String sCity;
	public Student() {
		
	}
	public Student(int sId, String sName, String sCity) {
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	

}
