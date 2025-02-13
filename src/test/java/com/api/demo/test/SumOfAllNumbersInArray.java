package com.api.demo.test;

import java.util.Arrays;

public class SumOfAllNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,100};
//		int sumofArray=Arrays.stream(arr).sum();                             //Approach 1
//		System.out.println("Sum of Array with Approach 1 : " +sumofArray);   //Approach 1
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println(" Sum of all Number in Array : " +sum);
		
	}

}
