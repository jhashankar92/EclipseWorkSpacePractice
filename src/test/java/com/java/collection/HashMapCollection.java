package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {

		Map<Integer, String> students=new HashMap<Integer, String>();   // Map Interface
		students.put(101, "Tom");    //HashMap is Unordered and fastest key value pairs
		students.put(102, "Dick");   
		students.put(103,"Harry");
		students.put(104, "Tom");
		
		System.out.println("Print Map Data : " +students);    //Print Map Data : {101=Tom, 102=Dick, 103=Harry, 104=Tom}
        System.out.println("Print the data with id : " +students.get(103));  //Print the data with id : Harry
        
        for(Map.Entry<Integer, String> entry:students.entrySet()) {   //iterate
        	System.out.println(entry.getKey()+"-->" +entry.getValue());
        }		
		
	}

}
