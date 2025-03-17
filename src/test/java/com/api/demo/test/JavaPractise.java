package com.api.demo.test;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class JavaPractise {
	
	public static int getFactorial(int num) {
		
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			
	     fact=fact*i;	
			
		}	
		return fact;
	}
	
	
	public static void main(String args[]) {
		
		System.out.println(+getFactorial(6));
	}
}
