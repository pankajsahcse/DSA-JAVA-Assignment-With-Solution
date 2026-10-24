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
	

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
