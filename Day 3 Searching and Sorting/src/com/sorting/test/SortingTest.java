package com.sorting.test;

import java.util.Arrays;
import java.util.Scanner;

import com.sorting.bussinesslogic.Sorting;

public class SortingTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 4, 7, 9 };
		String[] sArr = { "Pankaj", "Kunal", "Iet", "Paras" };

		System.out.println(
				"1. Ascending Order For Integer \n2. Descending Order for Integer \n3. Ascending Order For String \n4. Descending Order for String");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Sorting.bubbleSort(arr);
			System.out.println(Arrays.toString(arr));
			break;
		case 2:
			Sorting.descBubbleSort(arr);
			System.out.println(Arrays.toString(arr));
			break;
		case 3:
			Sorting.bubbleSortForString(sArr);
			System.out.println(Arrays.toString(sArr));
			break;
		case 4:
			Sorting.bubbleSortForStringDesc(sArr);
			System.out.println(Arrays.toString(sArr));
			break;
		default:
			System.out.println("Invalid Choice ");
			break;
		}

		System.out.println("++++++++++++++++++++++++++++++++++");
		Sorting.improvedBubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

}
