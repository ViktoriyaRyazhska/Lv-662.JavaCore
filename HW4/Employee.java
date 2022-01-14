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

		
		Employee e1 = new Employee();
		e1.setName("Tonny");
		e1.setDepartmentNumber(2);
		e1.setSalary(2830);
		
		Employee e2 = new Employee();
		e2.setName("Jim");
		e2.setDepartmentNumber(1);
		e2.setSalary(3200);
		
		Employee e3 = new Employee();
		e3.setName("Ross");
		e3.setDepartmentNumber(2);
		e3.setSalary(2550);
		
		Employee e4 = new Employee();
		e4.setName("Kolin");
		e4.setDepartmentNumber(3);
		e4.setSalary(3250);
		
		Employee e5 = new Employee();
		e5.setName("Ben");
		e5.setDepartmentNumber(3);
		e5.setSalary(2440);
		
		String[] firstDepartment = {"Jim"};
		String[] secondDepartment = {"Tonny", "Ross"};
		String[] thirdDepartment = {"Kolin", "Ben"};
		
		switch (departmentNumber) {
		case 1:
			System.out.println(Arrays.toString(firstDepartment));
			break;
		case 2:
			System.out.println(Arrays.toString(secondDepartment));
			break;
		case 3:
			System.out.println(Arrays.toString(thirdDepartment));
		}

		int[] salaries = {2830, 3200, 2550, 3250, 2440};
		int[] salariesDesc = Arrays.stream(salaries).boxed()
			    .sorted(Collections.reverseOrder())
			    .mapToInt(Integer::intValue)
			    .toArray();

			System.out.println(Arrays.toString(salariesDesc));
		
		// int sorting;
		// int[] salaries = {2830, 3200, 2550, 3250, 2440};
		
		// for (int i = 0; i < salaries.length; i ++) 
		// {
		// 	for (int j = i +1; j < salaries.length; j++)
		// 	{
		// 		if (salaries[i] < salaries[j])
		// 		{
		// 			sorting = salaries[i];
		// 			salaries[i] = salaries[j];
		// 			salaries[j] = sorting;
		// 		}
		// 	}
		// }
		// System.out.println(Arrays.toString(salaries));
		
	}
}

