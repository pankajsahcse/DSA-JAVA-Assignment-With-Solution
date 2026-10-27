package com.stack;

public class MyStackList {
	Node top;

	class Node {
		int data;
		Node next;

		// constructor of Node Class
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// constructor of SingliyLinkedList Class
	public MyStackList() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;

	}

	public void push(int val) {
		Node newNode = new Node(val);
		if (!isEmpty()) {
			newNode.next = top;
			
		}
		top = newNode;
		System.out.println("Pushed " + val);
	}

	public int pop() {
		if (!isEmpty()) {
			Node temp = top;
			top = top.next;
			top.next = null;
			System.out.println("\nPopped " + temp.data);
			return temp.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

}
