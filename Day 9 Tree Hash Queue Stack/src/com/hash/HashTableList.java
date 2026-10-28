package com.hash;

public class HashTableList {
	Node[] heads;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public HashTableList() {
		heads = new Node[5];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}
	}

	public void insertData(int data) {
		Node newNode = new Node(data);

		int pos = data % heads.length;

		if (heads[pos] != null) {
			newNode.next = heads[pos];
			
		}
		heads[pos] = newNode;

	}
	
	public void displayhash() {
		for (int i = 0; i < heads.length; i++) {
			Node temp = heads[i];                                 
			while (temp != null) {
				System.out.print(temp.data +"->");
				temp = temp.next;
			}
			System.out.println("Null");
		}
	}
	
	public void searchData(int num) {
		int pos = num%heads.length;
		Node temp = heads[pos];
		
		while (temp!= null) {
			if (temp.data == num) {
				System.out.println("data found at "+pos+" position ");
			}else {
				System.out.println("not found");
			}
			temp = temp.next;
		}
		
	}
}
