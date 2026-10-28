package com.linkedlist;

import com.beans.Employee;

public class EmployeeSinglyGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Object Type--------------\n");
		GenericSinglyLinkedList<Employee> glemp = new GenericSinglyLinkedList<>();

		glemp.addNode(new Employee(100, "Pankaj", 10000));
		glemp.addNode(new Employee(101, "Paras", 70000));
		glemp.addNode(new Employee(102, "Rohan", 11000));
		glemp.addNode(new Employee(103, "Sohan", 11200));
	
		glemp.displayAll();
		glemp.addByPosition(new Employee(104, "Ram", 12456), 5);
		glemp.deleteNodeAtPosition(4);
		glemp.displayAll();

		System.out.println("-----------String Type--------------\n");

		GenericSinglyLinkedList<String> gllstr = new GenericSinglyLinkedList<>();

		gllstr.addNode("Panjak");
		gllstr.addNode("Paras");
		gllstr.addNode("Rohan");
		gllstr.addNode("Soham");

		gllstr.displayAll();
	}

}
