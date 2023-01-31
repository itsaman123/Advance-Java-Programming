package com.spring.reference;

public class A {
	int x;
	B objB;
	public A() {
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObjB() {
		return objB;
	}
	public void setObjB(B objB) {
		this.objB = objB;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", objB=" + objB + "]";
	}
	

}
