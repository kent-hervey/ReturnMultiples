package com.hervey.app;

public class Quad<A, B, C, D> {
	public A intValue;
	public B stringValue;
	public C booleanValue;
	public D doubleValue;
	
	
	
	public Quad(A intValue, B stringValue, C booleanValue, D doubleValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;
		this.booleanValue = booleanValue;
		this.doubleValue = doubleValue;
	}



	@Override
	public String toString() {
		return "intValue=" + intValue + ", stringValue=" + stringValue + ", booleanValue=" + booleanValue
				+ ", doubleValue=" + doubleValue + "";
	}

	
	
	
}
