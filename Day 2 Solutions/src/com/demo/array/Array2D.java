package com.demo.array;

import java.util.Scanner;

public class Array2D {
	private int[][] arr;

	public Array2D() {
		arr = new int[2][2];
	}

	public Array2D(int row, int colm) {
		arr = new int[row][colm];
	}

	public Array2D(int[][] arr) {
		this.arr = arr;
	}

	// Accept data into Array

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter data for " + i + " and " + j + " :");
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	// display data from array
	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// find rowWise Max
	public int[] findRowWiseMax() {
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = -1;
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			temp[i] = max;
		}
		return temp;
	}

	// find rowWise Minimum

	public int[] findRowWiseMin() {
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i][0];
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			temp[i] = min;
		}
		return temp;
	}

	// find ColumnWise Max
	public int[] findcolmWiseMax() {
		int[] temp = new int[arr[0].length];

		for (int i = 0; i < arr[0].length; i++) {
			int max = Integer.MIN_VALUE; // arr[0][i]
			for (int j = 0; j < arr.length; j++) {

				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}
			temp[i] = max;
		}
		return temp;
	}

	// find ColumnWise Minimum

	public int[] findcolmWiseMin() {
		int[] temp = new int[arr[0].length];

		for (int i = 0; i < arr[0].length; i++) {
			int min = Integer.MAX_VALUE; // arr[0][i]
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] < min) {
					min = arr[j][i];
				}
			}
			temp[i] = min;
		}
		return temp;
	}

	// Transpose matrix

	public int[][] transposeMatrix() {
		int[][] transpose = new int[arr[0].length][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}

		return transpose;
	}

	// Identity Matrix
	public boolean checkIdentityMatrix() {

		// Identity matrix must be equal their row and column
		if (arr.length != arr[0].length) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				// Diagonal should be 1
				if (i == j && arr[i][j] != 1) {
					return false;
				}

				// Non - diagonal should be 0

				if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		// if all condition are not true than this is identity matrix
		return true;
	}

	// Identity Matrix

//	public boolean checkIdentityMatrix() {
//
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				if (i == j && arr[i][j] == 1) {
//					count++;
//				}
//			}
//		}
//		int length = arr.length;
//		if (length == count) {
//			return true;
//		}
//		return false;
//	}

	// Addition of all Value

	public int sumOfAllValue() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				sum += arr[i][j];

			}
		}
		return sum;
	}

	// Sum of all Digits of all numbers

	public int[][] sumOfDigit() {
		int[][] digitSumArr = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				int firstEl = arr[i][j];
				int sum = 0;
				while (firstEl != 0) {
					int rem = firstEl % 10;
					sum = sum + rem;
					firstEl /= 10;
				}
				digitSumArr[i][j] = sum;
			}

		}
		return digitSumArr;
	}

	// Row Wise Shift
	public int[][] rowWiseShift(boolean flag, int k) {
		if (flag) {
			// up shift
			k = k % arr.length;
			while (k != 0) {
				int[] temp = arr[0];
				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
				k--;
			}

		} else {
			// down Shift
			k = k % arr.length;
			while (k != 0) {
				int[] temp = arr[arr.length - 1];
				for (int i = arr.length - 1; i > 0; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = temp;
				k--;
			}
		}
		return arr;
	}

	// Row Wise Sum

	public int[] rowWiseSum() {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			result[i] = sum;
		}
		return result;
	}

	// Column Wise sum

	public int[] columnWiseSum() {
		int[] result = new int[arr[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			result[i] = sum;
		}
		return result;
	}

	// column wise rotate

	// flag=true then rotate right
	// flag=false then rotate left
	public void columnRotate(boolean flag, int k) {
		if (flag) {
			k = k % arr[0].length;
			while (k != 0) {
				// create a temp array and
				int[] temp = new int[arr.length];
				// copy last column into temp array
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][arr[0].length - 1];
				}
				// shift all remaining columns to right
				for (int i = arr[0].length - 2; i >= 0; i--) {
					for (int j = 0; j < arr.length; j++) {
						arr[j][i + 1] = arr[j][i];
					}
				}
				// copy temp array to 0 th column of array
				for (int i = 0; i < temp.length; i++) {
					arr[i][0] = temp[i];
				}

				k--;
			}

		} else {
			k = k % arr[0].length;
			while (k != 0) {

				int[] temp = new int[arr.length];

				// copy first column into temp array
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][0];
				}

				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						arr[j][i] = arr[j][i + 1];
					}
				}

				for (int i = 0; i < arr.length; i++) {
					arr[i][arr.length - 1] = temp[i];
				}

				k--;
			}
		}
	}

	// Multiplication of 2 2DArray
	public int[][] findmultliplication(Array2D ob) {

		if (arr.length != ob.arr[0].length) {
			System.out.println("Rows and Colmun size should be same");

		} else {

			int[][] multi = new int[arr.length][arr[0].length];

			for (int i = 0; i < arr.length; i++) { // row
				for (int j = 0; j < ob.arr[0].length; j++) { // column
					for (int k = 0; k < ob.arr.length; k++) { // changing value 1 to ...
						multi[i][j] += arr[i][k] * ob.arr[k][j];
					}
				}
			}

			return multi;
		}
		return null;
	}

	// Addition of two 2D arrays

	public int[][] additionOfArrays(Array2D ob) {
		int[][] addResult = new int[arr.length][arr[0].length];

		// checking whether row and column for both array is same or not
		if (arr.length != ob.arr.length || arr[0].length != ob.arr[0].length) {
			System.out.println("Rows and Colmun size should be same");
			return null;
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < ob.arr.length; j++) {

				addResult[i][j] = arr[i][j] + ob.arr[i][j];
			}

		}

		return addResult;

	}

	// Subtraction of two 2D arrays

	public int[][] substractOfArrays(Array2D ob) {
		int[][] addResult = new int[arr.length][arr[0].length];

		// checking whether row and column for both array is same or not
		if (arr.length != ob.arr.length || arr[0].length != ob.arr[0].length) {
			System.out.println("Rows and Colmun size should be same");
			return null;
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < ob.arr.length; j++) {

				addResult[i][j] = arr[i][j] - ob.arr[i][j];
			}

		}

		return addResult;

	}

}
