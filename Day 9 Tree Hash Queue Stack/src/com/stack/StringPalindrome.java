package com.stack;

class MyGenricStack<T> {
	Node top;

	class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public MyGenricStack() {
		this.top = null;
	}

	public void push(T data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public T pop() {
		if (!isEmpty()) {
			T data = top.data;
			top = top.next;
			return data;
		} else {
			System.out.println("Stack is Empty");
			return null;
		}

	}

	public boolean isEmpty() {
		return top == null;
	}
}

public class StringPalindrome {

	public static void isPalindromeString(String str) {
		MyGenricStack<Character> stk = new MyGenricStack<>();

		// Data pushed
		for (int i = 0; i < str.length(); i++) {
			stk.push(str.charAt(i));
		}

		// Data pop and check is it equals or not

		String s = "";

		while (!stk.isEmpty()) {
			s = s + stk.pop();
		}
		
		if(s.equals(str)) {
			System.out.println("Palindrome ");
		}else {
			System.out.println("Not Palindrome ");
		}

	}

	public static void main(String[] args) {

		String s = "madam";
		StringPalindrome.isPalindromeString(s);

	}

}
