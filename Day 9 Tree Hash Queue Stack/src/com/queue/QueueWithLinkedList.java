package com.queue;

public class QueueWithLinkedList {
	Node front;
	Node rear;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public QueueWithLinkedList() {
		this.front = null;
		this.rear = null;
	}

	public boolean isEmpty() {
		
		return front == null && rear == null;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			front = newNode;

		}else {
			rear.next = newNode;
		}
	
		rear = newNode;
		System.out.println("Data Added " + data);

	}

	public void dequeue() {
		if (!isEmpty()) {

			Node temp = front;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			temp.next = null;
			System.out.println("data deleted = " + temp.data);
		} else {
			System.out.println("Queuesssss is empty");
		}

	}
}
