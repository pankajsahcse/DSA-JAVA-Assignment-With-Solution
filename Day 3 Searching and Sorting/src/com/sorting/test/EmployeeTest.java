package com.sorting.test;

import com.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee.addEmployees();
		Employee.sortBySalaryAsc();
		
		Employee.sortByName();
		
		Employee.sortedById();
	}
}
