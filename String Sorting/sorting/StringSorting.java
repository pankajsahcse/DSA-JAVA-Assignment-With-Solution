package com.string.sorting;

import java.util.Arrays;

public class StringSorting {

	public static void bubbleSortString(String [] sarr) {
		for(int i = 0; i < sarr.length -1; i++) {
			for(int j = 0; j < sarr.length -i -1; j++) {
				if(sarr[j].compareTo(sarr[j+1]) > 0) {
					String temp = sarr[j];
					sarr[j] = sarr[j+1];
					sarr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sarr));
	}
	
	public static void bubbleSortStringDesc(String [] sarr) {
		for(int i = 0; i < sarr.length -1; i++) {
			for(int j = 0; j < sarr.length -i -1; j++) {
				if(sarr[j].compareTo(sarr[j+1]) < 0) {
					String temp = sarr[j];
					sarr[j] = sarr[j+1];
					sarr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sarr));
	}

	public static void main(String[] args) {
		String sarr[] = { "Pankaj", "Rahul", "Kamesh", "Pawan", "Rohan", "Dhiraj" };
		StringSorting.bubbleSortString(sarr);
		StringSorting.bubbleSortStringDesc(sarr);
	}
}
