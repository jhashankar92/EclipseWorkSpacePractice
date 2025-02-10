package com.api.demo.test;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		
		int arr[]= {5,3,8,1,2,2};
		
		Arrays.sort(arr);   //Step 1 for sorting bubble
		System.out.println("Sorted Array With Collection Method : " +Arrays.toString(arr)); //step 2 for sorting bubble
		
		
		//bubble sort logic
		for(int i=0;i<arr.length-1;i++) {
		//	System.out.println("Print i : " +i);
			for (int j=0;j<arr.length-1-i;j++) {
			//	System.out.println(" Print value of j :" +j);
				if(arr[j]> arr[j+1]) {
				int temp=arr[j];	
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				}
				
				}		
			}
		System.out.println("Bubble Sort Array : " + Arrays.toString(arr));
		
		}		
}


//Given array: [5, 3, 8, 1, 2]
//We are swapping 5 and 3 when arr[j] = 5 and arr[j + 1] = 3.

//Before Swap:
//Index	0	1	2	3	4
//Array	5	3	8	1	2
//Step 1: Store arr[j] in a temporary variable

//int temp = arr[j];   // temp = 5
//temp now holds 5, so we don’t lose it.
//Step 2: Assign arr[j + 1] to arr[j]

//arr[j] = arr[j + 1];   // arr[j] = 3
//Now, arr[0] (previously 5) becomes 3.
//Index	0	1	2	3	4
//Array	3	3	8	1	2
//Problem: We have two "3"s now, and "5" is gone (but it’s stored in temp).

//Step 3: Assign temp (original arr[j]) to arr[j + 1]

//arr[j + 1] = temp;   // arr[j + 1] = 5
//The original 5 (stored in temp) is placed into arr[1].
//Index	0	1	2	3	4
//Array	3	5	8	1	2