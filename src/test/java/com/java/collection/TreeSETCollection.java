package com.java.collection;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TreeSETCollection {
	
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(56);
		ts.add(61);  
		ts.add(10);
		ts.add(11);   //duplicate not allowed, sorted in ascending order, Slower than HashSet
		ts.add(11);
		ts.add(23);		
		System.out.println("Print the numbers ascending Order : " +ts);
		ts.addAll(Arrays.stream(numbers).boxed().collect(Collectors.toSet()));	
		System.out.println("Print the numbers ascending Order : " +ts);	
	}

}
