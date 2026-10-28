package com.queue;

public class CircleQueueWithArray {

	private int[] arr;
	private int front, rear;

	public CircleQueueWithArray() {
		this.arr = new int[4];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (front == 0 && rear == arr.length - 1) {
			return true;
		} /*
			 * else if (front == rear + 1) { return true; }
			 */
		return false;
	}

	// add data into array

	public boolean enqueue(int data) {
		if (!isFull()) {
			if (front == -1) {
				front = 0;
			}

			rear = (rear + 1) % arr.length;
			arr[rear] = data;
			System.out.println("Data Added " + data);
			return true;

		}
		System.out.println("Queue Array is Full");
		return false;
	}

	// delete from queue
	public boolean dequeue() {
		if (!isEmpty()) {
			int n = arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % arr.length;
			}
			System.out.println("Poped Success " + n);
		}
		return false;
	}

}
