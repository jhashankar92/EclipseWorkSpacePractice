package com.java.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCharacterCount {

	public static void main(String[] args) {

		// Step 1: Define a string
		String str = "Hello";

		// Step 2: Initialize a HashMap to store character occurrences
		HashMap<Character, Integer> countCharacter = new HashMap<Character, Integer>();

		// Step 3: Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // Get the character at the current index

			// Step 4: Check if the character is not a space (not required in this case, but
			// useful for handling spaces)
			if (ch != ' ') {
				// Step 5: Update the frequency count in the HashMap
				// If the character exists, increment its count; otherwise, initialize it with 1
				countCharacter.put(ch, countCharacter.getOrDefault(ch, 0) + 1);
			}
		}
		// Step 6: Print the occurrences of each character
		System.out.println("Print the Occurence of characters");
		for (char key : countCharacter.keySet()) { // Iterate over each unique character (key) in the HashMap
			System.out.println(key + "==>" + countCharacter.get(key)); // Print character and its count
		}
	}
}
