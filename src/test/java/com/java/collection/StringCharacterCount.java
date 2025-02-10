package com.java.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCharacterCount {

	public static void main(String[] args) {

		String str="Hello Welcome to Java World";
		str=str.toLowerCase();
		char [] arrayString=str.toCharArray();
		System.out.println(arrayString);
		Map<Character, Integer> countCharacters=new HashMap<Character, Integer>();
		
		for (char ch:arrayString) {
			if (ch !=' ') {
				System.out.println(countCharacters.put(ch, countCharacters.getOrDefault(ch, 0)+1));
		}
		
		
		
		
		
		
		}		
		
		
	}

}
