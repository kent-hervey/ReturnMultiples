package com.hervey.app;

public class ReturnFourThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quad<Integer, String, Boolean, Double> dataBack = DataProcessor.returnFour();
		
		System.out.println("Four values are:  " + dataBack.toString());
	}



}
