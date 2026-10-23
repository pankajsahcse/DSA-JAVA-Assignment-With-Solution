package com.businesslogic;

public class NthMaxiMum {

	// index of maximum number

	public static int findMaxIndex(int[] arr, int start) {
		int maxIndex = start;
		for (int i = start + 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	// find nth Maximum Number

	public static int findMaxNumber(int[] arr, int num) { // num may be 4th max or 3 max

		for (int i = 0; i < arr.length; i++) {
			int index = findMaxIndex(arr, i);
			// swapping index value to i value
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		return arr[num - 1];
	}
}
