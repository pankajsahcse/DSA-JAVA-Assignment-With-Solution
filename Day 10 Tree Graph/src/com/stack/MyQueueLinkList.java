package com.stack;

public class MyQueueLinkList {

	Node front;
	Node rear;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	public MyQueueLinkList() {
		this.front = null;
		this.rear = null;
	}

	// checking queue is null or not
	public boolean isEmpty() {
		return front == null && rear == null;
	}

	// Adding code
	public boolean enqueue(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		System.out.println("added " + val);
		return true;
	}

	// Delete code
	public int dequeue() {
		if (!isEmpty()) {
			Node temp = front;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			temp.next = null;
			return temp.data;
		} else {
			System.out.println("queue is empty");
			return -1;
		}
	}

	public void displayData() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + "---->");
			temp = temp.next;
		}
		System.out.println("null");

	}

}
