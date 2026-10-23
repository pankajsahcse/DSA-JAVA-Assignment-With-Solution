package com.test;

import java.util.Arrays;

import com.businesslogic.SelectionSort;

public class SelectionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {2,7,9,4,13,6,40};
		int arr[] = {7,5,3,1,6,9};
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------");
		SelectionSort.SelectionSortAsc(arr);
		SelectionSort.SelectionSortAsc1(arr);
		System.out.println("+++++++++Descending+++++++++");
		
		
		SelectionSort.SelectionSortDesc(arr);
		SelectionSort.SelectionSortDesc1(arr);
		
		
		String str[] = {"abcd","ijkl","mnop","efgh"};
		System.out.println(Arrays.toString(str));
		
		SelectionSort.SelectionSortStringAsc(str);
		
		SelectionSort.SelectionSortStringDesc(str);
		
		
		System.out.println("-------------------");
		
		SelectionSort ss = new SelectionSort();
		ss.addData();
		
		SelectionSort.SelectionSortEmpAsc();
		System.out.println("/////////////n\n");
		SelectionSort.SelectionSortEmpDesc();
	}

}
