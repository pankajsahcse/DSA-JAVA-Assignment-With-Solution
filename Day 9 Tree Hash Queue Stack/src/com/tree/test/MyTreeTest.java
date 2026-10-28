package com.tree.test;

import com.tree.MyBSTree;

public class MyTreeTest {

	public static void main(String[] args) {

		MyBSTree bst = new MyBSTree();

		bst.insertNode(11);
		bst.insertNode(71);
		bst.insertNode(41);
		bst.insertNode(31);
		
		bst.insertNode(61);
		bst.insertNode(21);
		bst.insertNode(81);
		bst.insertNode(91);
		
		bst.insertNode(51);
		
		System.out.println("Inorder Way");
		bst.inorder();
		
		System.out.println("Prerder Way");
		bst.preorder();
		
		System.out.println("Postorder Way");
		bst.postorder();
		
		bst.search(31);
		bst.deleteNode(21);
		
		bst.searchNonRecurssive(61);

	}

}
