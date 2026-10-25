package com.linkedlist;

public class SingliyLinkedList {

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

	// Operations

	// add a node at end
	public void addNode(int val) {
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
	public void addByPosition(int val, int pos) {
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

	// add node after given number

	public void addAfterGivenNumber(int val, int num) {
		Node temp = head;
		while (temp != null && temp.data != num) {
			temp = temp.next;
		}
		if (temp != null && temp.data == num) {
			Node newNode = new Node(val);
			newNode.next = temp.next; // it means both are referencing next node
			temp.next = newNode; // previous temp ke address me ab newNode aa gya hai
		} else {
			System.out.println("Not Found that number ");
		}
	}

	// add before given position

	public void addBeforeGivenNumber(int val, int num) {
		Node newNode = new Node(val);

		// check whether to add before first node
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
				newNode.next = temp;
				prev.next = newNode;
			} else {
				System.out.println("Number not found");
			}
		}
	}

	// Delete a node by given value

	public void deleteNodeByValue(int val) {

		// if list is empty
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		
		Node temp = head;
		
		// checking first node 
		/*
		if (temp.data == val) {
			Node temp1 = temp.next;
			head = temp1;
		} */
		
		if(head.data == val) {
			head = head.next;
			temp.next = null;
		}else {
			Node prev = head;
			temp = temp.next;
			
			while(temp != null && temp.data != val) {
				prev = temp;
				temp = temp.next;
			}
			if(temp != null && temp.data == val) {
				prev.next = temp.next;
				temp.next = null;
			}else {
				System.out.println("The value which are enter doesn't exist in List");
			}
		}
	}

	// Delete node at given position

	public void deleteNodeAtPosition(int pos) {
		/*
		Node temp = head;
		Node temp2 = temp.next;
		if (pos == 1) {
			head = temp2;
			System.out.println("\nDeleted at Position 1");
		} */
		
		// if list is empty
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		
		Node temp = head;
		
		if(pos == 1) {
			
			head = head.next;
			temp.next = null;
		}else {
			Node prev = head;
			temp = prev.next;
			
			for(int i = 1; temp != null && i <= pos -2; i++) {
				prev = temp;
				temp = temp.next;
			}
			
			if(temp != null) {
				prev.next = temp.next;
				temp.next = null;
			}else {
				System.out.println("The value which are enter doesn't exist in List");
			}
		}

	}

	// Display the node
	public void displayAll() {
		for (Node temp = head; temp != null; temp = temp.next) {
			System.out.print(temp.data + "--->");
		}
		System.out.println("null\n");
	}

}
