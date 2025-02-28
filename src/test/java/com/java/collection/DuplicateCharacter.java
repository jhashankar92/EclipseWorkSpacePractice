package com.java.collection;

import java.util.LinkedHashSet;

public class DuplicateCharacter {

	public static void main(String[] args) {
     
		String str="AABBCCDDEEE";
		
		// Use LinkedHashSet to store unique characters in order of appearance
		LinkedHashSet<Character> uniqueCharacter=new LinkedHashSet<Character>();  
		
		  // Iterate through the string and add characters to the set
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {              //Remove Spaces
				uniqueCharacter.add(ch);  // Automatically removes duplicates
			}
		}
		// Print unique characters
		System.out.println("**********Print the String By Removing Duplicate String**************");
		for(char keys: uniqueCharacter) {
			System.out.println(keys);               // Print characters without duplicates
		}
		
		
		
	}

}
