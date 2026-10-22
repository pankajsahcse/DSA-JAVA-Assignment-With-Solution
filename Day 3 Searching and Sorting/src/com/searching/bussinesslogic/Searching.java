package com.searching.bussinesslogic;

public class Searching {

	// Sequential Search
	public static int sequentialSearch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	// Binary Search

	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static int binarySearchOnString(String[] sarr, String word) {
		int low = 0;
		int high = sarr.length - 1;
		
		while(low <= high) {
			int mid = (low +high)/2;
			if(sarr[mid].compareTo(word)==0) {
				return mid;
			}else if (sarr[mid].compareTo(word) > 0) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
}
