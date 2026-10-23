package com.test;

import java.util.Arrays;

import com.businesslogic.NthMaxiMum;

public class NthMaximumTest {

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 1, 3, 4, 9, 8 };
		
		System.out.println(Arrays.toString(arr));
		
		int thirdMax = NthMaxiMum.findMaxNumber(arr, 3); // find 3rd maximum
		
		int fourthMax = NthMaxiMum.findMaxNumber(arr, 4); // find 4th maximum
		
		System.out.println("3rd Max is " + thirdMax);
		System.out.println("4th Max is " + fourthMax);

	}

}
