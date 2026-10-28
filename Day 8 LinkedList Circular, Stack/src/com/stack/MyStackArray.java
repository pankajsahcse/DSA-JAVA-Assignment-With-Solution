package com.stack;

public class MyStackArray {
	private int []arr; 
	private int top;
	
	public MyStackArray() {
		this.arr = new int [5];
		this.top = -1;
	}
	 public boolean isEmpty() {
		 return top == -1;
	 }
	 
	 public boolean isFull() {
		 return top == arr.length-1;
	 }
	 
	 public void push(int n) {
		 if (!isFull()) {
			top++;
			arr[top]=n;
			System.out.println("Pushed in Stack  "+n);
		}else {
			System.out.println("Stack is full");
		}
	 }
	 
	 public int pop() {
		 if (!isEmpty()) {
			 int n = arr[top];
			top--;
			System.out.println("poped  "+n);
			return n;
		}else {
			System.out.println("Stack is Empty");
		}
		 return -1;
	 }
	 
	 public void displayData() {
		 while (!isEmpty()) {
			 pop();
			 System.out.println();
		}
	 }
	 
	 
}
