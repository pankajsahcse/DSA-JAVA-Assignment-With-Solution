package com.test;

import com.businesslogic.InsertionSort;

public class InsertionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,7,12,10,15,13};
		InsertionSort.insertionAsc(arr);
		
		InsertionSort.insertionDesc(arr);
		
		System.out.println("-----------------------");
		
		String sarr[] = {"Paras","Pankaj","Ram","Sham","Arjun"};
		
		InsertionSort.insertionStringAsc(sarr);
		
		InsertionSort.insertionStringDesc(sarr);
		
		
		System.out.println("******************");
		InsertionSort is = new InsertionSort();
		is.addData();
		InsertionSort.insertion(false);

	}

}
