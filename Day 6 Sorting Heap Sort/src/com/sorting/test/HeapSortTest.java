package com.sorting.test;

import java.util.Arrays;

import com.sorting.HeapSort;

public class HeapSortTest {

	public static void main(String[] args) {
		//
		int [] arr = {10,3,76,34,23,32,20};
		System.err.println(Arrays.toString(arr));
		HeapSort.heapSortAsc(arr);

	}

}
