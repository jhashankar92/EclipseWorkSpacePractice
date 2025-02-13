package com.api.demo.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class DemoTest7 {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10,13};
		boolean allEven=true;
		
		for (int num :arr) {
			if (num %2!=0) {  //if any number is odd
				allEven=false;
				break;
			}
			
		}
		
		System.out.print(allEven);
			

	}
}
