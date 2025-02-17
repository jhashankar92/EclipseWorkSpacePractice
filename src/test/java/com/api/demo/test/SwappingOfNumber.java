package com.api.demo.test;

public class SwappingOfNumber {

	public static void main(String[] args) {

		int a=5;
		int b=10;
		System.out.println("Before Swap: a= " +a + ",b=" +b);
		
//		int temp=a;      //approach 1
//		a=b;             //approach 1
//		b=temp;          //approach 1
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After Swap: a= " +a + ",b=" +b);
		
		
		
		
		
		
		
		
	}

}
