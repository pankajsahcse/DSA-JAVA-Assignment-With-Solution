package com.stack;

import java.util.Stack;

public class StringPalindrome {
	
	public static void isPalindrome(String s) {
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			stk.push(ch);
		}
		
		String ss = "";
		
		while(!stk.empty()) {
//			Character c = stk.pop();
//			ss += c;
			ss += stk.pop();
		}
		
		if(ss.equals(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		String s = "madam";
		isPalindrome(s);
	}

}
