package com.stack.test;

import com.stack.StringPalindrom;

public class StringPalindromeTest {

	public static void main(String[] args) {
		String str = "nitin";

		StringPalindrom sp = new StringPalindrom();
		boolean status = sp.isPalindrome(str);

		System.out.println(status ? "Palindrome " : "Not Palindrome");
	}

}
