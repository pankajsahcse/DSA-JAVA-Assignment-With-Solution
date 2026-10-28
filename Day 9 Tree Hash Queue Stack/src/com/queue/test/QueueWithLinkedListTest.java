package com.queue.test;

import com.queue.QueueWithLinkedList;

public class QueueWithLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWithLinkedList ll = new QueueWithLinkedList();
		
		ll.enqueue(40);
		ll.enqueue(50);
		ll.enqueue(404);
		ll.enqueue(140);
		ll.enqueue(505);
		
		while (!ll.isEmpty()) {
			ll.dequeue();
			
		}
	}

}
