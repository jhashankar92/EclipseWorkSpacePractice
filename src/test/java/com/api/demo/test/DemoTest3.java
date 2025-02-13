package com.api.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoTest3 {

	public static void main(String[] args) {
		int[] numbers = { 10, 12, 45, 56, 89 }; // Approach 1
		int largestNumber = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Print the largest number : " + largestNumber);

//		ArrayList<Integer> arry=new ArrayList<Integer>(Arrays.asList(20,43,11,22,55,80,56));   //Approach 2 with collection
//		int largestNumber1=Collections.max(arry);
//		int smallestNumber1=Collections.min(arry);
//		System.out.println("Print largest from an array :" +largestNumber1);
//		System.out.println("Print Smallest from an array : " + smallestNumber1);
		
//		int [] arr= {23,43,54,33,26,88,33,100,32,43};                     //Approach 3 by adding array in collection
//		ArrayList<Integer> arry=new ArrayList<Integer>();
//		 for(int num:arr) {
//			 arry.add(num);
//		 }
//		System.out.println(arry);	
//		int greatestNumber=Collections.max(arry);
//		System.out.println("Print Greater number : " +greatestNumber);
		
		

		int[] arr = { 12, 3, 5, 7, 2, 9, 8, 15, 11, 10, 19 };  //approach 1

		System.out.println("Odd Number : ");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}

		System.out.println("\n Even Number : ");
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.print(num + " ");

			}

		}
		
//		ArrayList<Integer> arrList=new ArrayList<Integer>(Arrays.asList(2,4,8,10,12,11,7,5));  //Approach 2 
//		ArrayList<Integer> allEvenNumber=new ArrayList<Integer>(); 
//		ArrayList<Integer> allOddNumber=new ArrayList<Integer>();
//		
//		for(int num: arrList) {
//			if(num %2==0) {
//				allEvenNumber.add(num);
//			}
//			else {
//				allOddNumber.add(num);
//			}
//		}
//		System.out.println("All Even Number in Array : " +allEvenNumber);
//		System.out.println("All Odd Number in Array : " +allOddNumber);		
		
	}
}
