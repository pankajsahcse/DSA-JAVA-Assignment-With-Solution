package com.sorting.test;

import java.util.Arrays;

import com.sorting.CountingSort;

public class CountingSortTest {

	public static void main(String[] args) {

		int[] arr = { 10, 3, 24, 56, 32, 1, 1, 3 };
		int[] ansArr = CountingSort.countSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ansArr));

		int[] ansArrDesc = CountingSort.countSortDesc(arr);

		System.out.println(Arrays.toString(ansArrDesc));

		String[] sarr = { "pankaj", "omkar", "soham", "vaibhav", "ansu", "paras" };
		System.out.println("String Ascending");
		String[] ansArrofString = CountingSort.countSortString(sarr);
		System.out.println(Arrays.toString(ansArrofString));
		
		
		System.out.println("Based on first char of string");
		String[] ansArrofChar = CountingSort.countSortChar(sarr);
		System.out.println(Arrays.toString(ansArrofChar));

	}
}
