package com.stack;

public class StringPalindrom {

	Node top;

	class Node {
		char data;
		Node next;

		public Node(char ch) {
			data = ch;
			next = null;
		}
	}

	public StringPalindrom() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	// Push each character into stack
	public void push(String str) {

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			Node newNode = new Node(ch);

			newNode.next = top;
			top = newNode;
		}
	}

	// Pop character from stack
	public char pop() {

		if (!isEmpty()) {
			
			char ch = top.data;
			top = top.next;
		
			return ch;
		} else {
			System.out.println("Stack is empty");
		}
		return '\0';
	}

	// Check Palindrome
	public boolean isPalindrome(String str) {

		// Push all characters
		push(str);

		// Compare original string with popped characters
		for (int i = 0; i < str.length(); i++) {

			char ch = pop();

			if (str.charAt(i) != ch) {
				return false;
			}
		}

		return true;
	}

}
