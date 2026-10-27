package com.linkedlist;


public class GenericSinglyLinkedList<T>{
	Node head;

	class Node {
		T data;
		Node next;

		// constructor of Node Class
		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

	// constructor of SingliyLinkedList Class
	public GenericSinglyLinkedList() {
		head = null;
	}

	// Operations

	// add a node at end
	public void addNode(T val) {
		Node newNode = new Node(val);

		// if list is empty
		if (head == null) {
			head = newNode;
		} else {
			// place the temp node at the last node
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next; // temp node me hi uska next hold kiya gya
			}
			temp.next = newNode;
		}
	}

	// add node at given position
	public void addByPosition(T val, int pos) {
		if (head != null) {
			Node newNode = new Node(val);

			// add before first node
			if (pos == 1) {
				newNode.next = head;
				head = newNode; // now newNode is head
			} else {
				Node temp = head;
				for (int i = 1; temp != null && i <= pos - 2; i++) {
					temp = temp.next;
				}
				if (temp != null) {
					newNode.next = temp.next;
					temp.next = newNode;
				} else {
					System.out.println("List is empty");
				}
			}
		}
	}


	

	// Delete node at given position
	public void deleteNodeAtPosition(int pos) {

		// If list is empty
		if (head == null) {
			System.out.println("Empty List");
			return;
		}

		// Assuming position starts from 0
		// Position 0 means deleting the head
		if (pos == 1) {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}

		if (pos < 0) {
			System.out.println("Invalid Position");
			return;
		}

		Node prev = head;
		Node temp = prev.next;

		// Move to the node before the position
		for (int i = 1; temp != null && i <= pos - 2; i++) {

			if (temp.next == null) {
				System.out.println("Position out of range");
				return;
			}
			prev = temp;
			temp = temp.next;
		}

		// Position is out of range
		if (temp.next == null) {
			System.out.println("Position out of range");
			return;
		}

		// Delete the node
		prev.next = temp.next;
		temp.next = null;
	}

	// Display the node
	public void displayAll() {
		for (Node temp = head; temp != null; temp = temp.next) {
			System.out.print(temp.data + "--->");
		}
		System.out.println("null\n");
	}
}
