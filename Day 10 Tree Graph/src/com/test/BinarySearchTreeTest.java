package com.test;

import com.model.BinarySearchTree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insertNode(20);
		bst.insertNode(30);
		bst.insertNode(40);
		bst.insertNode(50);
		
		bst.search(21);
		bst.searchWithRecur(50);
		bst.deleteNode(40);
		
		bst.search(40);
		bst.search(30);
		bst.searchWithRecur(50);
		

	}

}
