package com.linkedlist;

class SingliyLinkedList {
	Node head;

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
	public SingliyLinkedList() {
		head = null;
	}

	// Add Node
	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			System.out.println("Added");
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println("Added");
		}

	}

	// search Node

	public void searchNode(int val) {
		if (head == null) {
			System.out.println("List Empty");
			return;
		} else {
			Node temp = head;
			while (temp != null && temp.data != val) {
				temp = temp.next;
			}
			if (temp != null && temp.data == val) {
				System.out.println("Found " + val);
			} else {
				System.out.println("Value not match");
			}
		}
	}

	// delete node

	public void deleteNode(int val) {
		if (head == null) {
			System.out.println("List Empty");
			return;
		} else {

			if (head.data == val) {
				Node temp = head;
				head = head.next;
				temp.next = null;
				System.out.println("Deleted");
				return;
			}

			Node prev = head;
			Node temp = prev.next;
			while (temp != null && temp.data != val) {
				prev = temp;
				temp = temp.next;
			}

			if (temp != null && temp.data == val) {
				prev.next = temp.next;
				temp.next = null;
				System.out.println("Deleted");
			} else {
				System.out.println("Value not match");
			}
		}
	}

	// add node after the number
	public void addAfterNumber(int val, int num) {

		if (head == null) {
			System.out.println("List empty");
			return;
		}

		Node newNode = new Node(val);

		Node temp = head;
		while (temp != null && temp.data != num) {
			temp = temp.next;
		}
		if (temp != null && temp.data == num) {
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println("Added after value");
		} else {
			System.out.println("Value not match");
		}

	}

	// Add Before the number

	public void addBeforeNumber(int val, int num) {

		if (head == null) {
			System.out.println("List empty");
			return;
		}
		Node newNode = new Node(val);

		if (head.data == num) {
			newNode.next = head;
			head = newNode;
		} else {
			Node prev = head;
			Node temp = prev.next;
			while (temp != null && temp.data != num) {
				prev = temp;
				temp = temp.next;
			}
			if (temp != null && temp.data == num) {
				newNode.next = prev.next;
				prev.next = newNode;
				System.out.println("Added Before value");
			} else {
				System.out.println("Value not match");
			}
		}

	}

	// Added by position

	public void addByPos(int val, int pos) {

		if (head == null) {
			System.out.println("List empty");
			return;
		}

		Node newNode = new Node(val);

		if (pos == 1) {
			newNode.next = head;
			head = newNode;

		} else {
			Node temp = head;
			int i = 1;
			while (temp != null && i <= pos - 2) {
				temp = temp.next;
				i++;
			}
			if (i > pos - 2 && temp != null) {
				newNode.next = temp.next;
				temp.next = newNode;
				System.out.println("Added after Position");
			} else {
				System.out.println("Position bound");
			}
		}

	}

	// Display Node
	public void display() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

}

public class SinglyLinkedList {

	public static void main(String[] args) {
		SingliyLinkedList sll = new SingliyLinkedList();
		sll.addNode(30);
		sll.addNode(49);
		sll.display();

		sll.searchNode(49);

		sll.deleteNode(30);
		sll.display();

		sll.addAfterNumber(50, 49);
		sll.display();

		sll.addBeforeNumber(48, 49);
		sll.display();

		sll.addByPos(56, 1);
		sll.display();

	}

}
