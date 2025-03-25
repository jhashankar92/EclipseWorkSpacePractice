package com.api.demo.test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class JavaPractise {

	public static void main(String args[]) {

		String str = "aaabbccceee";
		char [] ch=str.toCharArray();
		System.out.println("Value of str : "+Arrays.toString(ch));

		LinkedHashSet<Character> uniqueCharacter = new LinkedHashSet<Character>();
				
		for(char c:ch) {
			uniqueCharacter.add(c);
		}
		
           for(char key:uniqueCharacter) {
        	   System.out.println(key);
           }
	}
}
