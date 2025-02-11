package com.java.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCharacterCount {

	public static void main(String[] args) {
		
		String str="Aaabbbccddffrr";
		HashMap<Character, Integer> countCharacter=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch!=' ') {
				countCharacter.put(ch, countCharacter.getOrDefault(ch, 0)+1);				
			}
		}
			System.out.println("Print the Occurence of characters");
			for (char key:countCharacter.keySet()) {
				System.out.println(key+ "==>" +countCharacter.get(key));
			}			
		}		
	}

