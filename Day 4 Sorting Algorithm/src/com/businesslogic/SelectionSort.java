package com.businesslogic;

import java.util.Arrays;

public class SelectionSort {
	
	class Emp {
		public String name;
		public int id;
		public int salary;
		
		public Emp( int id,String name, int salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
		}
		
		
	}
	
	public static Emp [] emp1 = new Emp[5]; 
	// to add data in the Employee
	public void addData() {
		emp1[0]=new Emp(101,"aaaa",578000);
		emp1[1]=new Emp(102,"bbbba",770000);
		emp1[2]=new Emp(103,"cccccaa",8000);
		emp1[3]=new Emp(104,"Rama",123);
		emp1[4]=new Emp(100,"dddd",789100);
	}

	// Selection Sort in Ascending Order
	public static void SelectionSortAsc(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int index = findmin(arr, i);

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
	// To Find Minimum Value
	private static int findmin(int arr[], int start) {
		int minindex = start;
		for (int i = start; i < arr.length; i++) {
			if (arr[minindex] > arr[i]) {
				minindex = i;
			}
		}
		return minindex;
	}
	// Selection Sort in Descending Order
	public static void SelectionSortDesc(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int index = findmax(arr, i);

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
	// To Find Maximum Value
	private static int findmax(int arr[], int start) {
		int maxindex = start;
		for (int i = start; i < arr.length; i++) {
			if (arr[maxindex] < arr[i]) {
				maxindex = i;
			}
		}
		return maxindex;
	}
	// Selection Sort in Ascending Order
	public static void SelectionSortAsc1(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minidex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minidex]) {
					int temp = arr[minidex];
					arr[minidex] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	// Selection Sort in Descending Order
	public static void SelectionSortDesc1(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxidex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxidex]) {
					int temp = arr[maxidex];
					arr[maxidex] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	// Selection Sort in Ascending Order to String
	public static void SelectionSortStringAsc(String sarr[]) {
		for (int i = 0; i < sarr.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < sarr.length; j++) {
				if (sarr[j].compareTo(sarr[minindex]) < 0 ) {
					String temp = sarr[minindex];
					sarr[minindex] = sarr[j];
					sarr[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(sarr));
	}
	// Selection Sort in Descending Order to String
	public static void SelectionSortStringDesc(String sarr[]) {
		for (int i = 0; i < sarr.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < sarr.length; j++) {
				if (sarr[j].compareTo(sarr[minindex]) > 0 ) {
					String temp = sarr[minindex];
					sarr[minindex] = sarr[j];
					sarr[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(sarr));
	}
	// Selection Sort in Ascending Order for Employee
		public static void SelectionSortEmpAsc() {

				for (int i = 0; i < emp1.length; i++) {
					int index = findmin(emp1, i);

					Emp temp = emp1[i];
					emp1[i] = emp1[index];
					emp1[index] = temp;
				}

				for (Emp emp : emp1) {
					System.out.println(emp);
				}
			}
			// To Find Minimum Value
			private static int findmin(Emp emp1[], int start) {
				int minindex = start;
				for (int i = start; i < emp1.length; i++) {
					if (emp1[minindex].salary > emp1[i].salary) {
						minindex = i;
					}
				}
				return minindex;
			}
			
			// Selection Sort in Descending Order for Employee
			public static void SelectionSortEmpDesc() {

					for (int i = 0; i < emp1.length; i++) {
						int index = findmax(emp1, i);

						Emp temp = emp1[i];
						emp1[i] = emp1[index];
						emp1[index] = temp;
					}

					for (Emp emp : emp1) {
						System.out.println(emp);
					}
				}
				// To Find Minimum Value
				private static int findmax(Emp emp1[], int start) {
					int maxindex = start;
					for (int i = start; i < emp1.length; i++) {
						if (emp1[maxindex].salary < emp1[i].salary) {
							maxindex = i;
						}
					}
					return maxindex;
				}
}
