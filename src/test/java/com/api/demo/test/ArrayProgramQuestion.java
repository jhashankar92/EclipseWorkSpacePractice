package com.api.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayProgramQuestion {

	public static void main(String[] args) {
		int [] arr = { 22, 44, 33, 10, 55, 88, 22, 44, 22 ,1,1,100,100};
		Arrays.sort(arr);

		LinkedHashSet<Integer> arry1 = new LinkedHashSet<Integer>();

		for (int ary : arr) {
			arry1.add(ary);
		}
		System.out.println("Print without duplicate: " + arry1);

	}

}
