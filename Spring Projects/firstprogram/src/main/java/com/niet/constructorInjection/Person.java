package com.niet.constructorInjection;

public class Person {
	private String pId;
	private String pName;
	public Person(String pId, String pName) {
	
		this.pId = pId;
		this.pName = pName;
	}
	@Override
	public String toString() {
		 return this.pId+  "  :  "+this.pName;
	}
	
}