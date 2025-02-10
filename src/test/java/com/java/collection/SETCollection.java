package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class SETCollection {

	public static void main(String[] args) {
     
		Set<String> fruits=new HashSet<String>();   //HashSet for no duplicate, unordered, fastest insert/search
		fruits.add("Apple");
		fruits.add("Apple");  // Duplicate (ignored)
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		System.out.println("Print fruits name : " +fruits);  //  [Apple, Grapes, Mango, Orange, Banana]  (order may vary)
		System.out.println("Print boolean result : " +fruits.contains("guava"));  //output--false
		System.out.println("Print boolean result : " +fruits.contains("Mango"));  //output--true		
		
	}

}
