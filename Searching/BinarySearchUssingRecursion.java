package com.searching;

import java.util.Arrays;

public class BinarySearchUssingRecursion {

	// Using Recursion
	public static int binarySearchRecursion(int[] arr, int low, int high, int key) {
		Arrays.sort(arr);

		if (low > high) {
			return -1;
		}

		if (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				return binarySearchRecursion(arr, mid + 1, high, key);
			} else if (arr[mid] > key) {
				return binarySearchRecursion(arr, low, mid - 1, key);
			}

		}

		return -1;
	}

	// Without Recursion

	public static int binarySearch(int arr[], int key) {
		Arrays.sort(arr);

		int low = 0;
		int high = arr.length -1;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int n = BinarySearchUssingRecursion.binarySearchRecursion(arr, 0, arr.length, 30);
		System.out.println(n);

		int n1 = BinarySearchUssingRecursion.binarySearch(arr, 50);
		System.out.println(n1);
	}

}
