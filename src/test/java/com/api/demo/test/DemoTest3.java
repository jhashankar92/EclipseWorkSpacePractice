package com.api.demo.test;
import java.util.Arrays;

public class DemoTest3 {

	public static void main(String[] args) {
		int [] numbers= {10,12,45,56,89};
		
		int largestNumber=Arrays.stream(numbers).max().getAsInt();
		System.out.println("Print the largest number : "+largestNumber);
		
		int [] arr= {12,3,5,7,2,9,8,15,11,10,19};
		
		System.out.println("Odd Number : ");
		for(int num:arr) {
			if(num % 2!=0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println("\n Even Number : ");
		for (int num:arr) {
			if(num %2==0) {
				System.out.print(num +" ");
				
			}
			
		}
}			
	}


