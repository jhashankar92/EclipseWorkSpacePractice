package com.api.demo.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class DemoTest7 {

	public static void main(String[] args) {
           
       Integer [] arry= {2,4,5,8,22};
           Arrays.sort(arry);
       System.out.println("Print the array in Ascending Order: " +Arrays.toString(arry));
       
       Arrays.sort(arry, Collections.reverseOrder());
       System.out.println("Print the array in Descending Order: " +Arrays.toString(arry));
       
       			
	}
}
