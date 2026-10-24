package com.sorting;

public class CountingSort {

	// find integer max
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// count sort for Integer ascending
	public static int[] countSort(int[] arr) {
		int max = findMax(arr);

		int[] countarr = new int[max + 1];

		// no of occurrence in countArr, if available than ++
		for (int i = 0; i < arr.length; i++) {
			int indexForCountarr = arr[i];
			countarr[indexForCountarr]++;
		}

		// Cumulative sum
		for (int i = 1; i < countarr.length; i++) {
			countarr[i] = countarr[i] + countarr[i - 1];
		}

		// create an array size of original array
		int[] outputArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			int posForOutputArr = countarr[val] - 1;
			countarr[val]--;
			outputArr[posForOutputArr] = val;
		}
		return outputArr;
	}

	// count sort for integer descending

	public static int[] countSortDesc(int[] arr) {
		int max = findMax(arr);

		int[] countarr = new int[max + 1];

		// no of occurrence in countarr, if available than ++
		for (int i = 0; i < arr.length; i++) {
			int indexForCountarr = arr[i];
			countarr[indexForCountarr]++;
		}

		// Cumulative sum
		for (int i = countarr.length - 1; i >= 1; i--) {

			countarr[i - 1] = countarr[i] + countarr[i - 1];
//			System.out.println(countarr.length);
//			System.out.println(countarr.length - 1);
//			System.out.println(i + " " + (i-1));
		}

		// create an array size of original array
		int[] outputArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			int posForOutputArr = countarr[val] - 1;
			countarr[val]--;
			outputArr[posForOutputArr] = val;
		}
		return outputArr;
	}

	// count sort for Character ascending

	
	public static String[] countSortChar(String[] sarr) {
	    // Characters range from 0 to 65535 in Java
	    int[] count = new int[256 + 1];

	    //Count occurrences of the first character
	    for (int i = 0; i < sarr.length; i++) {
	        char ch = sarr[i].charAt(0);

	        count[ch]++;
	    }

	    // Cumulative sum
	    for (int i = 1; i < count.length; i++) {
	        count[i] = count[i] + count[i - 1];
	    }

	    //  Output array
	    String[] outputArr = new String[sarr.length];

	    // Traverse from right to left to keep the sort stable
	    for (int i = 0; i < sarr.length ; i++) {
	        char ch = sarr[i].charAt(0);

	        int position = count[ch] - 1;
	        outputArr[position] = sarr[i];

	        count[ch]--;
	    }

	    return outputArr;
	}
	
	
	
	// Count sort on String ascending
	public static String[] countSortString(String[] arr) {

	    // Find the maximum string length
	    int maxLength = 0;
	    for (String str : arr) {
	        maxLength = Math.max(maxLength, str.length());
	    }

	    String[] output = new String[arr.length];

	    // Sort from rightmost character to leftmost
	    for (int pos = maxLength - 1; pos >= 0; pos--) {

	        int[] count = new int[256];

	        // Count characters
	        for (String str : arr) {
	            int ch = (pos < str.length()) ? str.charAt(pos) : 0;
	            count[ch]++;
	        }

	        // Cumulative count
	        for (int i = 1; i < count.length; i++) {
	            count[i] += count[i - 1];
	        }

	        // Build output from right to left
	        for (int i = arr.length - 1; i >= 0; i--) {
	            int ch = (pos < arr[i].length()) ? arr[i].charAt(pos) : 0;

	            output[count[ch] - 1] = arr[i];
	            count[ch]--;
	        }

	        // Copy back
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = output[i];
	        }
	    }

	    return arr;
	}
	

}
