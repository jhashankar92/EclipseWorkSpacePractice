package com.api.demo.test;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoTest5 {

	public static void main(String[] args) {

		String input = "Alice,Bob,Charlie";
		String[] str = input.split(",");
		System.out.println("Print the array with approach 1: " + Arrays.toString(str)); // Approach 1

		ArrayList<String> arrayList = new ArrayList<String>();
		for (String s : str) {
			arrayList.add(s);
		}
		System.out.println("Print the approach 2 " + arrayList);

	}

}
