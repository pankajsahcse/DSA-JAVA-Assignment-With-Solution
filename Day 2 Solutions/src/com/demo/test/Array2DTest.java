package com.demo.test;

import java.util.Arrays;

import com.demo.array.Array2D;

public class Array2DTest {

	// display data from array for parameterized
	public static void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		Array2D obj = new Array2D();
//		obj.acceptData();
//		obj.displayData();

		int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };
		int[][] arrr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Array2D obj = new Array2D(arrr); // for all operation and Object also

		Array2D newObj = new Array2D(ar); // for use of multiplication

		int[] ansOfMax = obj.findRowWiseMax();
		System.out.println("Row wise Max");
//		System.out.println("1st max is from first row and 2nd max is from second");
		System.out.println(Arrays.toString(ansOfMax));

		System.out.println("--------------------------------");

		System.out.println("Row wise Min");

		int[] ansOfMin = obj.findRowWiseMin();
		System.out.println(Arrays.toString(ansOfMin));

		int[] ansOfMaxCol = obj.findcolmWiseMax();
		System.out.println("Column wise Max");
//		System.out.println("1st max is from first row and 2nd max is from second");
		System.out.println(Arrays.toString(ansOfMaxCol));

		System.out.println("--------------------------------");

		System.out.println("Column wise Min");
//		System.out.println("1st min is from first row and 2nd min is from second");
		int[] ansOfMincolm = obj.findcolmWiseMin();
		System.out.println(Arrays.toString(ansOfMincolm));

		System.out.println("--------------------------------");

		System.out.println("Before Transopose");
		System.out.println((Arrays.deepToString(arrr)));
		int transAns[][] = obj.transposeMatrix();
		System.out.println("After Transopose");
		System.out.println(Arrays.deepToString(transAns));

		System.out.println("--------------------------------");

		boolean ansOfIndentiy = obj.checkIdentityMatrix();
		System.out.println(ansOfIndentiy ? "Identity Matrix" : "Not Identity Matrix");

		System.out.println("--------------------------------");

		int sum = obj.sumOfAllValue();
		System.out.println("Sum of total Element is " + sum);

		System.out.println("--------------------------------");

		int digitsum[][] = obj.sumOfDigit();
		System.out.println("After Sum of Digit");
		System.out.println(Arrays.deepToString(digitsum));

		System.out.println("--------------------------------");
		System.out.println("Display data by own Method ");
		Array2DTest.display(digitsum);

		System.out.println("--------------------------------");

		System.out.println("Before Shift");
		Array2DTest.display(arrr);
		System.out.println("Row wise UP Shift");
		int[][] rowRotateAns = obj.rowWiseShift(true, 1);
		Array2DTest.display(rowRotateAns);

		System.out.println("--------------------------------");

		System.out.println("Before Shift");
		Array2DTest.display(arrr);
		System.out.println("Row wise Down Shift");
		rowRotateAns = obj.rowWiseShift(false, 1);
		Array2DTest.display(rowRotateAns);

		System.out.println("--------------------------------");
		System.out.println("Our Matrix");
		Array2DTest.display(arrr);
		int[] rowSum = obj.rowWiseSum();
		System.out.println("Sum = " + Arrays.toString(rowSum));

		System.out.println("--------------------------------");
		System.out.println("Our Matrix");
		Array2DTest.display(arrr);
		int[] columnSum = obj.columnWiseSum();
		System.out.println("Sum = " + Arrays.toString(columnSum));

		System.out.println("--------------------------------");
		System.out.println("Our Matrix");
		Array2DTest.display(arrr);
		System.out.println("After Column Rotate ");
		obj.columnRotate(false, 2);
		Array2DTest.display(arrr);

		System.out.println("--------------------------------");

		System.out.println("Before Performing Operation");
		Array2DTest.display(arrr);
		System.out.println();
		Array2DTest.display(ar);

		System.out.println("Multiplication of 3 X 3 ");
		int[][] multiAns = obj.findmultliplication(newObj);
		Array2DTest.display(multiAns);

		System.out.println("--------------------------------");

		System.out.println("Addition of 3 X 3 ");
		int[][] addiResult = obj.additionOfArrays(newObj);
		Array2DTest.display(addiResult);

		System.out.println();
		System.out.println("Subtracton of 3 X 3 ");
		int[][] subsResult = obj.substractOfArrays(newObj);
		Array2DTest.display(subsResult);

	}
}
