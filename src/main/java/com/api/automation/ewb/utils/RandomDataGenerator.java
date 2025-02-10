package com.api.automation.ewb.utils;

public class RandomDataGenerator {
	
	
	public static String getNumbericString(int length) {
		String alpha = "0123456789";
		StringBuilder stringBuilder = new StringBuilder(length);
 
		for (int i = 0; i < length; i++) {
			int index = (int) (alpha.length() * Math.random());
 
			// add Character one by one in end of sb
			stringBuilder.append(alpha.charAt(index));
		}
		// System.out.println("NumericString :"+stringBuilder.toString());
		return stringBuilder.toString();
 
	}
	
	public static void main (String args[] )
	{
		System.out.println(getNumbericString(5));
	}

}
