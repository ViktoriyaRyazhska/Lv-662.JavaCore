package l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Employee {
	
	public String name;
	public int departmentNumber;
	public int salary;
	
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the department number");
		int  departmentNumber = Integer.parseInt(br.readLine());

		Employee[] employees = new Employee[5];
		employees[0] = new Employee ("Tonny", 2, 2830);
		employees[1] = new Employee ("Jim", 1, 3200);
		employees[2] = new Employee ("Ross", 2, 2550);
		employees[3] = new Employee ("Kolin", 3, 3250);
		employees[4] = new Employee ("Ben", 3, 2440);
		
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getDepartmentNumber() ==  departmentNumber) {
			System.out.println(employees[i].getName());
			}
		}
		System.out.println();
		
		Employee sorting;
		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < employees.length; j++) {
				if (employees[i].salary > employees[j].salary) {
					sorting = employees[i];
					employees[i] = employees[j];
					employees[j] = sorting;
				}
			}
		}
		System.out.println("Salaries in descending order are: ");
		for (int i = 0; i < employees.length; i++) {
		System.out.println( employees[i].getSalary() + ", belongs to " +  employees[i].name);
		}
		
	}
}

