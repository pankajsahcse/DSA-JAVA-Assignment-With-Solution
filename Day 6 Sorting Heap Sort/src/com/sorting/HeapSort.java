package com.sorting;

import java.util.Arrays;

public class HeapSort {

	public static void heapSortAsc(int[] arr) {
		// convert the tree as MaxHeap Tree
		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
			// swap root-node element with the last value in the max heap
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			// Reconstruct the tree into max heap
			heapify(arr, i, 0);
		}
		System.out.println("Final Output Arrays : "+Arrays.toString(arr));
	}

	private static void heapify(int[] arr, int length, int i) {

		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;

		int largest = i; // i is the parent node
		int n = length; // n is length of the array

		// checking the left child is exist or not , if y then > than parent or not

		if (leftChild < n && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}

		// checking the right child is exist or not , if y then > than parent or not

		if (rightChild < n && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}

		if (largest != i) { // if parent node and largest's node is not same
			// swap i-th element and largest

			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;

			heapify(arr, n, largest);
		}
		System.out.println("heapify(i=" + i + ", n=" + n + ") -> " + Arrays.toString(arr));
	}
}
