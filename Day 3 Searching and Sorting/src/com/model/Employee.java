package com.model;

public class Employee {

	private int id;
	private String name;
	private int salary;

	static Employee[] err = new Employee[5];

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// To add data in  
	public static void addEmployees() {
		err[0] = new Employee(101, "Pankaj", 80000);
		err[1] = new Employee(102, "Shubham", 10000);
		err[2] = new Employee(103, "Paras", 70000);
		err[3] = new Employee(104, "Abhishek", 50000);
		err[4] = new Employee(105, "Harish", 90000);
	}

	public static void sortBySalaryAsc() {

		for (int i = 0; i < err.length - 1; i++) {

			for (int j = 0; j < err.length - i - 1; j++) {

				if (err[j].salary > err[j + 1].salary) {

					// Swap
//					Employee temp = err[j];
//					err[j] = err[j + 1];
//					err[j + 1] = temp;

					int temp = err[j].salary;
					err[j].salary = err[j + 1].salary;
					err[j + 1].salary = temp;
				}
			}
		}

		System.out.println("\nEmp sorted based on salary \n");

		for (Employee employee : err) {
			System.out.println(employee);
		}
	}

	public static void sortByName() {
		for (int i = 0; i < err.length - 1; i++) {
			for (int j = 0; j < err.length - i - 1; j++) {
				if (err[j].name.compareTo(err[j + 1].name) > 0) {
					String temp = err[j].name;
					err[j].name = err[j + 1].name;
					err[j + 1].name = temp;
				}
			}
		}
		System.out.println("\nEmp sorted by name \n");
		for (Employee employee : err) {
			System.out.println(employee);
		}
	}

	public static void sortedById() {
		for (int i = 0; i < err.length - 1; i++) {
			for (int j = 0; j < err.length - i - 1; j++) {
				if (err[j].id < err[j + 1].id) {

					int temp = err[j].id;
					err[j].id = err[j + 1].id;
					err[j + 1].id = temp;
				}
			}
		}
		System.out.println("\nEmp sorted by id in Descending Order \n");
		for (Employee employee : err) {
			System.out.println(employee);
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
