package com.api.demo.test;

import java.util.HashMap;

public class JavaPractise {

	public static void main(String[] args) {

		String str="My Name Is Shankar Jha";
		
	    HashMap<Character, Integer>  charCounter=new HashMap<Character, Integer>();
	    
	    for(int i=0;i<str.length();i++) {
	    	char ch=str.charAt(i);
	    	 if(ch!=' ') {
	    		charCounter.put(ch, charCounter.getOrDefault(ch, 0)+1) ;	 	    	
	 	    }	    		    		
	   }
	   
	    System.out.println("Print the count of character Occurence");
	    
	    for(char key:charCounter.keySet()) {
	    	System.out.println(key+ "  " +charCounter.get(key));
	    }		
		
	}

}
