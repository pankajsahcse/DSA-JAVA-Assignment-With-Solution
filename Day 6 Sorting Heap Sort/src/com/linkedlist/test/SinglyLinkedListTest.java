package com.linkedlist.test;

import com.linkedlist.SingliyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {

		SingliyLinkedList sll = new SingliyLinkedList();
		sll.addNode(23);
		sll.addNode(35);
		sll.addNode(11);
		sll.addNode(27);
		sll.addNode(33);
		sll.displayAll();

		System.out.println("\n--------- Again displaying all List\n");

		sll.addByPosition(99, 3);
		sll.addByPosition(999, 5);
		sll.displayAll();

		System.out.println("\n--------- Again displaying all List\n");
		sll.addBeforeGivenNumber(10, 11);
		sll.addAfterGivenNumber(45, 27);

		sll.displayAll();

		System.out.println("\n--------- Again displaying all List\n");
		sll.deleteNodeAtPosition(1);
		sll.displayAll();

		System.out.println("\n");

		System.out.println("After delete node at 3rd pos and delete value 45\n");

		sll.deleteNodeAtPosition(3);
		sll.deleteNodeByValue(45);
		sll.displayAll();

	}
}
