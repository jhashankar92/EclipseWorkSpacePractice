package com.api.demo.test;

public class DemoTest6 {

	public static void main(String[] args) {
		
		int [] arr= {2,4,6,8};
		
		Boolean allEven=true;
		
	     for(int num:arr) {
	    	 if (num % 2!=0) {
	    		 allEven=false;
	    		 break;
	    	 }
	     }
	    		 System.out.println(allEven);	    	 
	     	
	}
}
