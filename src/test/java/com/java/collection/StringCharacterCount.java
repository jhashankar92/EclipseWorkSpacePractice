package com.java.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCharacterCount {

	public static void main(String[] args) {
		
		String str="Hello My Name is Shankar Jha";
	
		
		HashMap<Character, Integer> countcharacter=new HashMap<Character, Integer>();
		
		for(char ch: str.toCharArray()) {
			if (ch !=' ') {
				countcharacter.put(ch, countcharacter.getOrDefault(ch,0)+1);
			}
		}
		
		// print the character
		System.out.println("Print the repetition of character");
		for(char key: countcharacter.keySet()) {
			System.out.println(key+ ":" +countcharacter.get(key));
		}		

	}
}
