package com.hash.test;

import com.hash.HashTableList;

public class HashTableListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableList hll = new HashTableList();
		
		hll.insertData(50);
		hll.insertData(45);
		hll.insertData(12);
		hll.insertData(60);
		hll.insertData(500);
		
		hll.displayhash();
		
		hll.searchData(12);
	}

}
