package com.queue.test;

import com.queue.CircleQueueWithArray;

public class CircleQueueWithArrayTest {

	public static void main(String[] args) {
		
		CircleQueueWithArray ca = new CircleQueueWithArray();
		
		ca.enqueue(45);
		ca.enqueue(75);
		ca.enqueue(85);
		ca.enqueue(95);
		
		ca.dequeue();
		ca.dequeue();
		ca.dequeue();
		ca.dequeue();

	}

}
