package com.test;

import java.util.Arrays;

import com.businesslogic.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {24,4,7,8,21,8,6,2,5};
		
		System.out.println(Arrays.toString(arr));
		
//		QuickSort.QuickSortAsc(arr, 0, arr.length-1);
		
		System.out.println("Descending Order ");
		QuickSort.QuickSortDesc(arr, 0, arr.length-1);
		
		
		
	}

}
