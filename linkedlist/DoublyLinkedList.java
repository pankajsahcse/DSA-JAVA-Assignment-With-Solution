package com.linkedlist;

public class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node next, prev;

		// constructor of Node Class
		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}

	}

	// constructor of SingliyLinkedList Class
	public DoublyLinkedList() {
		head = null;
	}

	// add node

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			if (temp != null) {
				newNode.next = temp.next;
				temp.next = newNode;
				newNode.prev = temp;
			}
		}
	}

	// search node

	public void searchNode(int data) {
		if (head == null) {
			System.out.println("Lst Empty");
			return;
		} else {
			Node temp = head;
			while (temp != null && temp.data != data) {
				temp = temp.next;
			}
			if (temp != null && temp.data == data) {
				System.out.println("Found data");
			} else {
				System.out.println("Data not available");
			}
		}
	}

	// addNode after

	public void addNodeAfterNum(int data, int num) {
		if (head == null) {
			System.out.println("Lst Empty");
			return;
		} else {
			Node newNode = new Node(data);

			if (head.data == num) {
				newNode.next = head.next;
				head.next = newNode;
				newNode.prev = head;
			} else {
				Node temp = head;
				while (temp != null && temp.data != num) {
					temp = temp.next;
				}
				if (temp != null && temp.data == num) {
					newNode.next = temp.next;
					newNode.prev = temp;
					temp.next = newNode;
					if (newNode.next != null) {
						newNode.next.prev = newNode;
					}
				}
			}
		}
	}

	// Add node before number

	public void addBefore(int data, int num) {
		if (head == null) {
			System.out.println("Lst Empty");
			return;
		} else {
			Node newNode = new Node(data);
			if (head.data == num) {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
			} else {
				Node temp = head;
				while (temp != null && temp.data != num) {
					temp = temp.next;
				}
				if (temp != null && temp.data == num) {
					newNode.prev = temp.prev;
					temp.prev.next = newNode;
					newNode.next = temp;
					temp.prev = newNode;
				} else {
					System.out.println("No not found");
				}
			}
		}
	}

	// add by pos

	public void addBypos(int data, int pos) {

		if (pos < 1) {
			System.out.println("Invalid position");
			return;
		}

		Node newNode = new Node(data);
		if (head == null) {

			if (pos == 1) {
				head = newNode;
			}

			return;
		} else {

			// If list has already data
			if (head != null) {

				if (pos == 1) {
					newNode.next = head;
					head.prev = newNode;
					head = newNode;
				} else {
					Node temp = head;
					int i = 1;
					while (temp != null && i <= pos - 1) {
						temp = temp.next;
						i++;
					}
					if (temp != null) {
						newNode.prev = temp.prev;
						temp.prev.next = newNode;
						newNode.next = temp;
						temp.prev = newNode;
					} else {
						System.out.println("Pos out of bound");
					}
				}
			}
		}
	}

	// delete Node

	public void deleteNode(int data) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			if (head.data == data) {
				head = temp.next;
				temp.next = null;
				temp.prev = null;
				System.out.println("Deleted");
			} else {
				while (temp != null && temp.data != data) {
					temp = temp.next;
				}
				if (temp != null && temp.data == data) {

					// Delete when its not a last element
					if (temp.next != null) {
						temp.next.prev = temp.prev;
					}
					temp.prev.next = temp.next;
					temp.next = null;
					temp.prev = null;
					System.out.println("Deleted");
				} else {
					System.out.println("Value not found");
				}

			}
		}
	}

	// Display

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

	public void displayReverse() {
		if (head == null) {
			System.out.println("Lst Empty");
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.prev;
			}
			System.out.println("null");
		}
	}

	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();
		dll.display();

		dll.addNode(45);
		dll.addNode(59);
		dll.addNode(55);
		dll.display();

		dll.displayReverse();

		dll.searchNode(55);

		dll.addNodeAfterNum(35, 45);
		dll.display();

		dll.addBefore(11, 45);
		dll.display();

		dll.addBefore(44, 59);
		dll.addBefore(44, 70);
		dll.display();

		dll.addBypos(2, 4);
		dll.display();

		dll.deleteNode(55);
		dll.display();

	}

}
