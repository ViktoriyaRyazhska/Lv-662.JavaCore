package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
	
	static void task1() {
		
		int[] array = {-10, 50, 33, -78, 125, -331, 45, -128, 12, 99};
		
		int biggest = array[0];
		int sumPos = 0, posCount = 0, negCount =0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > biggest) biggest = array[i];
			
			if (array[i] > 0) {
				
				posCount++;
				sumPos += array[i];
			}
			
			if (array[i] < 0) negCount++;
		
		}
		
		System.out.println("The biggest number is " + biggest);
		System.out.println("The sum of positive numbers is " + sumPos);
		System.out.println("The amount of negative numbers is " + negCount);
		
		if (posCount > negCount) System.out.println("There are more positives than negatives");
		if (posCount < negCount) System.out.println("There are more negatives than positives");
		if (posCount == negCount) System.out.println("Amount of negatives equals to positives");
		
	}
	
	static void task2() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] staff = new Employee[5];
		staff[0] = new Employee("Jack", 3, 2500);
		staff[1] = new Employee("Bob", 1, 1500);
		staff[2] = new Employee("Brian", 2, 2700);
		staff[3] = new Employee("Jim", 1, 2000);
		staff[4] = new Employee("Jerry", 3, 2300);
		
		System.out.print("Enter department number: ");
		int dep = Integer.parseInt(br.readLine());
		System.out.println("List of employees for department " + dep + ":");
		for (Employee employee: staff) {
			if (employee.getDepNumber() == dep)
				System.out.println(employee);
		}
		
		Employee tmp;
		for (int i = 0; i < staff.length - 1; i++) {
			for (int j = i + 1; j < staff.length; j++) {
				if (staff[i].getSalary() < staff[j].getSalary()) {
					tmp = staff[i];
					staff[i] = staff[j];
					staff[j] = tmp;
				}
			}
		}
		
		System.out.println("Sorting staff by salary in descending order...");
		for (Employee employee : staff) {
			System.out.println(employee);
		}
				
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		task1();
		task2();
		
	}

}

class Employee {
	
	private String name;
	private int depNumber;
	private double salary;
	
	public Employee(String name, int depNumber, double salary) {

		this.name = name;
		this.depNumber = depNumber;
		this.salary = salary;
	
	}

	public String getName() {
		return name;
	}

	public int getDepNumber() {
		return depNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepNumber(int depNumber) {
		this.depNumber = depNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", depNumber=" + depNumber + ", salary=" + salary + "]";
	}
	
}

