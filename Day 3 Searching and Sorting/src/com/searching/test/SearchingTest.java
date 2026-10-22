package com.searching.test;

import com.searching.bussinesslogic.Searching;

public class SearchingTest {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 4, 7, 9, 3 };

		int[] a = { 3, 5, 7, 9, 33, 54, 78, 90 };

		int indexOfNum = Searching.sequentialSearch(arr, 9);

		if (indexOfNum >= 0)
			System.out.println("Number found at " + indexOfNum + " index");
		else
			System.out.println("Number Not found");

		System.out.println("\nUsing Binary Search for Sorted Array \n");

		int indexOfNumer = Searching.binarySearch(a, 5);

		if (indexOfNumer >= 0)
			System.out.println("Number found at " + indexOfNumer + " index");
		else
			System.out.println("Number Not found");
		
		System.out.println("******************************");
		
		String [] sarrrr = {"Pankaj","Paras","Amar","Ram"};
		int sindex = Searching.binarySearchOnString(sarrrr, "Pankaj");
		if (sindex >= 0)
			System.out.println("String found at " + sindex + " index");
		else
			System.out.println("String Not found");
	}

}
