package com.java.collection;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayCollection {

	public static void main(String[] args) {

		List<String> arrayList=new ArrayList<>();  //fast for retrieval but slower for insert / delete shifting is required
		arrayList.add("Alice");
		arrayList.add("Bob");
		arrayList.add("Charlie");
		arrayList.add("Bob"); // allows duplicates
	    System.out.println("Print the arrayList :" +arrayList);    // Output: [Alice, Bob, Charlie, Bob]
	    arrayList.add(0, "John");   //slower for insert / delete shifting is required, we need to provide index number
	    arrayList.add(4, "Mac");
	    System.out.println("Array List after the addition :" +arrayList);    
	    arrayList.remove(4);
	    System.out.println("Array List after the removal : " +arrayList);
	    
	    
	    LinkedList<String> linkedList=new LinkedList<>(); //fast for insert/delete but slower for retrieval
	    linkedList.add("Alice");
	    linkedList.add("Bob");
	    linkedList.add("Charlie");
	    linkedList.add("Bob");
	    System.out.println("Print the Linked List Array : " +linkedList); // Output: [Alice, Bob, Charlie, Bob]
	    
	    linkedList.addFirst("John");
	    linkedList.addLast("Mac");
	    System.out.println("Linked List after addition :"+linkedList);
	    linkedList.removeLast();
	    System.out.println("Print the Linked List Array :"+linkedList);
	    
			
				
	}

}
