package com.tree;

public class MyBSTree {

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

	public MyBSTree() {
		this.root = null;
	}

	// Insert A node
	public void insertNode(int key) {
		root = insertData(root, key);
	}

	private Node insertData(Node root, int key) {

		Node newNode = new Node(key);

		// Tree is Empty
		if (root == null) {
			root = newNode;
			return root;

		} else {
			if (key < root.data) {
				root.left = insertData(root.left, key);
			} else {
				root.right = insertData(root.right, key);
			}
			return root;
		}
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

	// Search a node or data

	public boolean search(int key) {
		return searchBinaryTreeRecurssive(root, key);
	}

	private boolean searchBinaryTreeRecurssive(Node root, int key) {

		if (root != null) {
			if (root.data == key) {
				System.out.println("Key found");
				return true;
			} else if (key < root.data) {
				return searchBinaryTreeRecurssive(root.left, key);
			} else {
				return searchBinaryTreeRecurssive(root.right, key);
			}
		}
		System.out.println("Key not Found ");
		return false;
	}

	// Search by non Recursive

	public boolean searchNonRecurssive(int key) {
		return searchBinaryTreeNonRecurssive(root, key);
	}

	private boolean searchBinaryTreeNonRecurssive(Node root, int key) {

		if (root != null) {
			Node temp = root;
			while (temp != null) {
				if (temp.data == key) {
					System.out.println(key + "found");
					return true;
				} else if (key < temp.data) {
					temp = temp.left;
				} else {
					temp = temp.right;
				}
			}
			System.out.println(key + " Not found");
			return false;
		}

		return false;
	}

	// Tree Traversal
	// 1. In order

	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {

		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + ",   ");
			inorderTraversal(root.right);
		}

	}

	// 2. PreOrder

	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {

		if (root != null) {
			System.out.print(root.data + ", ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}

	// 3. postOrder

	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {

		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + ", ");
		}

	}

}
