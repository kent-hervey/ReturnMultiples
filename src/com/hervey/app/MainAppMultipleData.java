package com.hervey.app;


public class MainAppMultipleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quad<Integer, String, Boolean, Double> dataBack = DataProcessor.returnFour();
		 
		System.out.println("Four values are:  " + dataBack.toString());
		
		Triple<String, Integer> tripleTester = produceThreeThingsAndReturn("Fun times", 2);
		System.out.println(tripleTester.toString());
		
	}

	
	static Triple<String, Integer> produceThreeThingsAndReturn(String label, Integer inputNumber){
		Triple<String, Integer> theTriple= new Triple<String, Integer>();
		Integer timesTwo = inputNumber *2;
		Integer timesThree = inputNumber *3;
		theTriple.setIntegerValue1(timesTwo);
		theTriple.setIntegerValue2(timesThree);
		theTriple.setStringValue(label);
		
		return theTriple;
	}

	
	
	
}
