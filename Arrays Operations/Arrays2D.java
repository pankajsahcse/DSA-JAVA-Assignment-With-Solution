package com.arrays;

import java.util.Arrays;

public class Arrays2D {

	// Display

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	// Identity Matrix
	public static boolean identitYMatrix(int[][] arr) {

		if (arr.length != arr[0].length) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j && arr[i][j] != 1) {
					return false;
				}
				if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	// Transpose Matrix

	public static void transPose(int[][] arr) {
		int[][] newArr = new int[arr[0].length][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				newArr[i][j] = arr[j][i];
			}
		}
		display(newArr);
		System.out.println(Arrays.deepToString(newArr));
	}

	// addition of 2 array

	public static void addArrays(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[arr1.length][arr1.length];

		if (arr1.length != arr2.length) {
			System.out.println("both matrix should be same");
			return;
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		display(sum);
	}
	
	// Subtraction of 2 array

		public static void subtraction(int[][] arr1, int[][] arr2) {
			int[][] sum = new int[arr1.length][arr1.length];

			if (arr1.length != arr2.length) {
				System.out.println("both matrix should be same");
				return;
			}
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					sum[i][j] = arr1[i][j] - arr2[i][j];
				}
			}
			display(sum);
		}

	public static void main(String[] args) {

		int[][] ar = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.err.println(Arrays.deepToString(ar));
		System.err.println(Arrays.deepToString(arr));

		System.out.println(Arrays2D.identitYMatrix(ar));

		Arrays2D.transPose(arr);

		System.out.println("Addition");
		Arrays2D.addArrays(ar, arr);
		System.out.println("Subtraction");
		Arrays2D.subtraction(arr, ar);
	}

}
