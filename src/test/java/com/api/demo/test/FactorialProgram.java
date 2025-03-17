package com.api.demo.test;

public class FactorialProgram {

	public static int getFactorials(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String args[]) {

		System.out.println("The \"Factorial\" of given number is : " + getFactorials(5));

	}

}
