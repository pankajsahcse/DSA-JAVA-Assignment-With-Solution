package com.businesslogic;

import java.util.Arrays;



public class InsertionSort {
	
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
	
	public static void insertionAsc(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--; 
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	} 
	public static void insertionDesc(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]<key) {
				arr[j+1] = arr[j];
				j--; 
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	} 
	
	public static void insertionStringAsc(String arr[]) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j].compareTo(key)>0) {
				arr[j+1] = arr[j];
				j--; 
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	} 
	
	public static void insertionStringDesc(String arr[]) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j].compareTo(key)<0) {
				arr[j+1] = arr[j];
				j--; 
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	} 
	
	// Insertion Sort For Emp 
	public static void insertion(boolean flag) {
		for (int i = 1; i < emp1.length; i++) {
			int key = emp1[i].salary;
			int j = i-1;
			
			while(flag?j>=0 && emp1[j].salary>key:j>=0 && emp1[j].salary<key) {
				emp1[j+1].salary = emp1[j].salary;
				j--; 
			}
			emp1[j+1].salary=key;
		}
		for (Emp emp : emp1) {
			System.out.println(emp);
		}
	} 
	
 
}
