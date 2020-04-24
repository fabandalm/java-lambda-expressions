package com.falmeida.tech;

public class LambdaComparatorMain {

	public static void main(String[] args) {
		
		LambdaComparator comparator = (a1, a2) -> a1 > a2 ;
		
		boolean result = comparator.compare(2, 5);
		
		System.out.println("Result: " + result);
		
	}
	
}
