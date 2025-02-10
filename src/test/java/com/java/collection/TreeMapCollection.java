package com.java.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
    TreeMap<Integer, String> contacts=new TreeMap<Integer, String>();
    contacts.put(99, "Alice");
    contacts.put(100, "BOB");
    contacts.put(101, "Charlie");
    System.out.println(contacts);  //output {99=Alice, 100=BOB, 101=Charlie}		
    
    for(Map.Entry<Integer, String> iterate:contacts.entrySet()) {
    	System.out.println(iterate.getKey() + "====>" + iterate.getValue());
    }
		
	}

}
