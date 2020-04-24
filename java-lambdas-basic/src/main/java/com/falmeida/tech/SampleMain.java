package com.falmeida.tech;

public class SampleMain {

	public static void main(String[] args) {
		
		SampleInterface sample = (String text) -> {
		    System.out.print(text);
		};
		
		sample.printIt("New Interface Implementation");
		
	}
	
}
