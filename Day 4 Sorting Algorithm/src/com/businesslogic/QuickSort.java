package com.businesslogic;

import java.util.Arrays;

public class QuickSort {
	class Emp {
		public String name;
		public int id;
		public int salary;

		public Emp(int id, String name, int salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
		}

	}

	public static Emp[] emp1 = new Emp[5];

	// to add data in the Employee
	public void addData() {
		emp1[0] = new Emp(101, "aaaa", 578000);
		emp1[1] = new Emp(102, "bbbba", 770000);
		emp1[2] = new Emp(103, "cccccaa", 8000);
		emp1[3] = new Emp(104, "Rama", 123);
		emp1[4] = new Emp(100, "dddd", 789100);
	}

	public static void QuickSortAsc(int arr[], int start, int end) {
		System.out.println(start + "  " + end);
		if (start < end) {
			int p = partition(arr, start, end);

			QuickSortAsc(arr, start, p - 1);
			QuickSortAsc(arr, p + 1, end);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static int partition(int[] arr, int start, int end) {

		int pvt = start;
		int i = start;
		int j = end;

		while (i < j) {
			while ((i < end) && (arr[i] <= arr[pvt])) {
				i++;
			}
			while ((j > start) && (arr[j] > arr[pvt])) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} else {
				if (j != pvt) {
					int temp = arr[pvt];
					arr[pvt] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return j;

	}

	// Quick Sort Descending
	public static void QuickSortDesc(int arr[], int start, int end) {
		if (start < end) {
			int p = partitionDesc(arr, start, end);

			QuickSortDesc(arr, start, p - 1);
			QuickSortDesc(arr, p + 1, end);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static int partitionDesc(int[] arr, int start, int end) {

		int pvt = start;
		int i = start;
		int j = end;

		while (i < j) {
			// Descending -- larger values on left
			while ((i < end) && (arr[i] >= arr[pvt])) {
				i++;
			}
			// Smaller -- values on right
			while ((j > start) && (arr[j] < arr[pvt])) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} else {
				if (j != pvt) {
					int temp = arr[pvt];
					arr[pvt] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return j;

	}

}
