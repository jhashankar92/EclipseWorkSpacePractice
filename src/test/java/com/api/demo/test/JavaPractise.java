package com.api.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class JavaPractise {

	public static void main(String[] args) {

		String str = "KEYUR RATHOD";

		LinkedHashSet<Character>  distinctCharacter=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch!=' ') {
			distinctCharacter.add(ch);			
		}
		}
		System.out.println("Remove Duplicates Characters");
		
		for (char k:distinctCharacter) {
			System.out.println(k);
		}

	}
}
