package com.api.demo.test;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoTest5 {

	public static void main(String[] args) {
		
		String input=("Alice,Bob,Charlie");
	
		ArrayList<String> al=new ArrayList<>(Arrays.asList(input.toUpperCase().split(",")));
		System.out.println("The New Array List :"+al);		
						
		}		

	}


