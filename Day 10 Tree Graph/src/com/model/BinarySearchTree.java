package com.model;

public class BinarySearchTree {

	Node root;

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;

		}
	}

	public BinarySearchTree() {
		root = null;
	}

	// Insert Data

	public void insertNode(int key) {
		root = insertdata(root, key);
		if (root != null) {
			System.out.println("Node Inserted ");
		} else {
			System.out.println("Something went Wrong");
		}
	}

	private Node insertdata(Node root, int key) {
		// TODO Auto-generated method stub
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
			return root;
		} else {
			if (key < root.data) {
				root.left = insertdata(root.left, key);
			} else {
				root.right = insertdata(root.right, key);
			}
			return root;
		}

	}

	// search data with recursion

	public void search(int key) {
		searchDataWithRecursion(root, key);
	}

	private boolean searchDataWithRecursion(Node root, int key) {
		if (root == null) {
			System.out.println("Key Not Found");
			return false;
		} else {
			if (root.data == key) {
				System.out.println("Key Found");
				return false;
			} else if (key < root.data) {
				return searchDataWithRecursion(root.left, key);
			} else {
				return searchDataWithRecursion(root.right, key);
			}
		}
	}

	// search data without recursion

	public void searchWithRecur(int key) {
		searchWithoutRecursion(root, key);
	}

	private Node searchWithoutRecursion(Node root, int key) {
		if (root != null) {
			Node temp = root;
			while (temp != null) {

				if (temp.data == key) {
					System.out.println("Key Found");
					return root;
				} else if (key < root.data) {
					temp = temp.left;
				} else {
					temp = temp.right;
				}
			}
			System.out.println("Key Not Found");
		}
		return null;
	}

	// Delete a node

	public void deleteNode(int key) {
		root = deleteData(root, key);

		if (root != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Key not found");
		}
	}

	private Node deleteData(Node root, int key) {

		if (root == null) {
			return null;
		}

		if (key < root.data) {

			root.left = deleteData(root.left, key);

		} else if (key > root.data) {

			root.right = deleteData(root.right, key);

		} else {

			// 1. Leaf node
			if (root.left == null && root.right == null) {
				return null;
			}

			// 2. Only right child
			if (root.left == null) {
				return root.right;
			}

			// 2. Only left child
			if (root.right == null) {
				return root.left;
			}

			// 3. Two children
			root.data = minVal(root.right);

			root.right = deleteData(root.right, root.data);
		}

		return root;
	}

	private int minVal(Node root) {
		int minVal = root.data;

		while (root.left != null) {
			minVal = root.left.data;
			root = root.left;
		}

		return minVal;
	}

}
