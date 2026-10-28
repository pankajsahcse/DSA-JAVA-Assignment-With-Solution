package com.stack.test;

import com.stack.MyStackArray;

public class MyStackArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackArray msa = new MyStackArray();
		
		msa.push(11);
		msa.push(12);
		msa.push(13);
		msa.push(14);
		msa.push(15);
		msa.push(16);//Stack is Full
		
		msa.displayData();
	}

}
