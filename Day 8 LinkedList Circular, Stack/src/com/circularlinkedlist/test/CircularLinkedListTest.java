package com.circularlinkedlist.test;

import com.circularlinkedlist.CircularSiglyLinkedList;

public class CircularLinkedListTest {

	public static void main(String[] args) {

		CircularSiglyLinkedList csll = new CircularSiglyLinkedList();
		csll.addNode(45);
		csll.addNode(55);
		csll.addNode(65);
		csll.addNode(75);

		csll.displayAll();

		csll.addByPosition(60, 3);
		csll.addByPosition(3, 60);
		csll.addAfterGivennum(70, 65);
		csll.displayAll();
		
		csll.deleteByPosition(1);
		csll.deleteByValue(55);
		csll.deleteByValue(45);
		csll.displayAll();

	}

}
