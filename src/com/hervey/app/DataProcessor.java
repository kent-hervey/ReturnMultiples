package com.hervey.app;

public class DataProcessor {
	
	public static Quad<Integer, String, Boolean, Double> returnFour(){
		
		Integer intVal = 11;
		String stringVal = "Passing";
		Boolean booleanVal = true;
		Double doubleVal = 3.14;
	
		return new Quad<Integer, String, Boolean, Double>(intVal, stringVal, booleanVal, doubleVal);
	}
	

}
