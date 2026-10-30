package com.searching;

import java.util.Arrays;

public class FindNthMaximum {
	
	public static void findNthMaximum(int [] arr, int num) {
		
		for(int i = 0; i < arr.length; i++) {
			int maxIndex = findMax(arr,i);
			
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}	
		System.out.println(arr[num - 1]);
	}

	private static int findMax(int[] arr, int start) {
		
		int maxId = start;
		
		for(int i = start + 1; i < arr.length; i++) {
			if(arr[i] > arr[maxId]) {
				maxId = i;
			}
		}		
		return maxId;
	}

	public static void main(String[] args) {	
		int [] arr = {3,5,6,2,1,8,90};
		findNthMaximum(arr, 1);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
