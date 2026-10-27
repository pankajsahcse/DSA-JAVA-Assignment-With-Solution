package com.circularlinkedlist;

public class CircularDoublyLinkedList {
	Node head ;
	public class Node {
		int data ;
		Node next ,prev;
		
		public Node(int data ) {
			this.data= data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public CircularDoublyLinkedList() {
		head = null;
	}
	// To Add A node at end
	public void addNode(int val) {
		
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			newNode.next=head;
			newNode.prev= head;
		}else {
			Node temp = head.prev;
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.prev= temp;
			head.prev = newNode;
			
		}
	}
	
	public void addByPosition(int val,int pos) {
		
		if(head !=null) {
			Node newNode = new Node(val);
			if(pos == 1) {
				Node temp = head.prev;
				head.prev = newNode;
				temp.next = newNode;
				newNode.next = head;
				newNode.prev = temp;
				head = newNode;
			}else {
				Node temp = head;
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp = temp.next;
				}
				if (i>pos-2) {
					newNode.next= temp.next;
					newNode.prev = temp;
					temp.next.prev = newNode;
					temp.next = newNode;
				}else {
					System.out.println("Position is out of bound");
				}
			}
		}else {
			System.out.println("List is empty");
		}
	}
	
}
