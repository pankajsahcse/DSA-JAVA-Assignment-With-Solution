package com.sorting.bussinesslogic;

public class Sorting {

	// Bubble Sort

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) { // -1 Because of use j+1;
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		System.out.println("Using Bubble Sort, Array Sorted Ascending\n");
	}

	// Improved Bubble Sort
	public static void improvedBubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int swapCount = 0;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapCount++;
				}

			}
			if (swapCount == 0) {
				break;
			}
		}
		System.out.println("\nUsing Improved Bubble Sort, Array Sorted Ascending \n");
	}

	// Bubble Sort in Descending

	public static void descBubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) { // -1 Because of use j+1;
				if (arr[j] < arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		System.out.println("\nUsing Bubble Sort, Array Sorted Descending\n");
	}

	// Bubble Sort in Ascending for String

	public static void bubbleSortForString(String[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

		System.out.println("Using Bubble Sort,String Array Sorted Ascending\n");
	}
	
	// Bubble Sort in Ascending for String

		public static void bubbleSortForStringDesc(String[] arr) {

			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {

					if (arr[j].compareTo(arr[j + 1]) < 0) {
						String temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}

				}
			}

			System.out.println("Using Bubble Sort,String Array Sorted Descending\n");
		}

}
