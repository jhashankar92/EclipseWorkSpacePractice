package com.api.demo.test;

public class DemoTest4 {

	public static void main(String[] args) {
		
		String inputString="Hello Shankar Jha";
		
		String stringWithNoSpace=inputString.replace(" ","");
		System.out.println(stringWithNoSpace);
		
		char[] charArray=stringWithNoSpace.toCharArray();
		System.out.println(charArray);
		
		System.out.println("Character Array without spaces: ");
		for(char c: charArray) {
			System.out.print(c+" ");
		}
			
	}

}
