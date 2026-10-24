package com.sorting.test;

import java.util.Arrays;

import com.sorting.MergeSort;

public class MergeSortTest {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 1, 3, 2, 6, 3 };
		System.err.println(Arrays.toString(arr));

		int[] ansArr = MergeSort.mergingSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(ansArr));

		int[] ansArrDesc = MergeSort.mergingSortDesc(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(ansArrDesc));

		String[] sarr = { "pankaj", "paras", "shivam", "vaibhav", "abhishek", "pankaj" };
		String[] ansArrofString = MergeSort.mergingSortString(sarr, 0, sarr.length - 1);

		System.out.println(Arrays.toString(ansArrofString));
		
		String[] ansArrofStringDesc = MergeSort.mergingSortStringDesc(sarr, 0, sarr.length - 1);

		System.out.println(Arrays.toString(ansArrofStringDesc));
		
		
		MergeSort.addEmp();
		
		MergeSort.callEmployee();
	}

}
