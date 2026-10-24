package com.sorting;

import com.model.Employee;

public class MergeSort {

	static Employee emp[] = new Employee[5];
	static int end = emp.length - 1;

	public static void addEmp() {
		emp[0] = new Employee(11, "Paras", 1000);
		emp[1] = new Employee(12, "Pankaj", 2000);
		emp[2] = new Employee(13, "Abhishek", 5000);
		emp[3] = new Employee(14, "Soham", 500);
		emp[4] = new Employee(15, "Rohan", 900);
	}

	// For Employee call only as we cannot access end
	// variable in main so we call it in model
	public static void callEmployee() {
		mergingSortEmp(0, end);
		System.out.println("*******************");
		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}

	// Merge sort Ascending for Object Employee
	public static Employee[] mergingSortEmp(int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			// Left array
			mergingSortEmp(start, mid);

			// Right array
			mergingSortEmp(mid + 1, end);

			// for merging array left + right
			mergeEmp(start, mid, end);

		}
		return emp;

	}

	private static void mergeEmp(int start, int mid, int end) {
		int n1 = mid - start + 1; // size of left array
		int n2 = end - mid; // size of right array

		Employee[] a = new Employee[n1]; // left array
		Employee[] b = new Employee[n2]; // right array

		for (int i = 0; i < a.length; i++) {
			a[i] = emp[start + i];
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = emp[mid + 1 + j];
		}

		// merge left array and right array

		int i = 0, j = 0, k = start;

		while (i < a.length && j < b.length) {
			if (a[i].getSalary() < b[j].getSalary()) {
				emp[k] = a[i];
				k++;
				i++;
			} else {
				emp[k] = b[j];
				k++;
				j++;
			}
		}
		// copy remaining element to k array
		while (i < a.length) {
			emp[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			emp[k] = b[j];
			k++;
			j++;
		}
	}

	// Merge sort Ascending Integer
	public static int[] mergingSort(int[] arr, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			// Left array
			mergingSort(arr, start, mid);

			// Right array
			mergingSort(arr, mid + 1, end);

			// for merging array left + right
			merge(arr, start, mid, end);

		}
		return arr;

	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1; // size of left array
		int n2 = end - mid; // size of right array

		int[] a = new int[n1]; // left array
		int[] b = new int[n2]; // right array

		for (int i = 0; i < a.length; i++) {
			a[i] = arr[start + i];
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = arr[mid + 1 + j];
		}

		// merge left array and right array

		int i = 0, j = 0, k = start;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				arr[k] = a[i];
				k++;
				i++;
			} else {
				arr[k] = b[j];
				k++;
				j++;
			}
		}
		// copy remaining element to k array
		while (i < a.length) {
			arr[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			arr[k] = b[j];
			k++;
			j++;
		}
	}

	// merge sort Descending order

	public static int[] mergingSortDesc(int[] arr, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			// Left array
			mergingSortDesc(arr, start, mid);

			// Right array
			mergingSortDesc(arr, mid + 1, end);

			// for merging array left + right
			mergeDesc(arr, start, mid, end);

		}
		return arr;

	}

	private static void mergeDesc(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1; // size of left array
		int n2 = end - mid; // size of right array

		int[] a = new int[n1]; // left array
		int[] b = new int[n2]; // right array

		for (int i = 0; i < a.length; i++) {
			a[i] = arr[start + i];
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = arr[mid + 1 + j];
		}

		// merge left array and right array

		int i = 0, j = 0, k = start;

		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				arr[k] = a[i];
				k++;
				i++;
			} else {
				arr[k] = b[j];
				k++;
				j++;
			}
		}
		// copy remaining element to k array
		while (i < a.length) {
			arr[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			arr[k] = b[j];
			k++;
			j++;
		}
	}

	// merge sort String Ascending
	public static String[] mergingSortString(String[] arr, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			// Left array
			mergingSortString(arr, start, mid);

			// Right array
			mergingSortString(arr, mid + 1, end);

			// for merging array left + right
			mergeString(arr, start, mid, end);

		}
		return arr;

	}

	private static void mergeString(String[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1; // size of left array
		int n2 = end - mid; // size of right array

		String[] a = new String[n1]; // left array
		String[] b = new String[n2]; // right array

		// left array index value after divide
		for (int i = 0; i < a.length; i++) {
			a[i] = arr[start + i];
		}
		// right array index value after divide
		for (int j = 0; j < b.length; j++) {
			b[j] = arr[mid + 1 + j];
		}

		// merge left array and right array

		int i = 0, j = 0, k = start;

		while (i < a.length && j < b.length) {
			if (a[i].compareToIgnoreCase(b[j]) < 0) {
				arr[k] = a[i];
				k++;
				i++;
			} else {
				arr[k] = b[j];
				k++;
				j++;
			}
		}
		// copy remaining element to k array
		while (i < a.length) {
			arr[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			arr[k] = b[j];
			k++;
			j++;
		}
	}

	// merge sort String Descending
	public static String[] mergingSortStringDesc(String[] arr, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			// Left array
			mergingSortStringDesc(arr, start, mid);

			// Right array
			mergingSortStringDesc(arr, mid + 1, end);

			// for merging array left + right
			mergeStringDesc(arr, start, mid, end);

		}
		return arr;

	}

	// MergeDescending Method
	private static void mergeStringDesc(String[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1; // size of left array
		int n2 = end - mid; // size of right array

		String[] a = new String[n1]; // left array
		String[] b = new String[n2]; // right array

		// left array index value after divide
		for (int i = 0; i < a.length; i++) {
			a[i] = arr[start + i];
		}
		// right array index value after divide
		for (int j = 0; j < b.length; j++) {
			b[j] = arr[mid + 1 + j];
		}

		// merge left array and right array

		int i = 0, j = 0, k = start;

		while (i < a.length && j < b.length) {
			if (a[i].compareToIgnoreCase(b[j]) > 0) {
				arr[k] = a[i];
				k++;
				i++;
			} else {
				arr[k] = b[j];
				k++;
				j++;
			}
		}
		// copy remaining element to k array
		while (i < a.length) {
			arr[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			arr[k] = b[j];
			k++;
			j++;
		}
	}
}
