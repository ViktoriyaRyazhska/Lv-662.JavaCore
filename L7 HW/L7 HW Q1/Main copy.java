package l7HWQ1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	
//	static class SalComparator implements Comparable<Employee> {
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			return e1.calculatePay().compareTo(e2.calculatePay());
//		}
//
//		@Override
//		public int compareTo(Employee e) {
//			return Integer.compare(this.calculatePay(), e.calculatePay());
//		}
//		}

	public static void main(String[] args) {
		
		SalariedEmployee se1 =  new SalariedEmployee ("1", "Bob", 35, 15, "1");
		SalariedEmployee se2 =  new SalariedEmployee ("2", "John", 20, 20, "2");
		ContractEmployee ce1 =  new ContractEmployee ("3", "Jane", 50000, "3");
		ContractEmployee ce2 =  new ContractEmployee ("4", "Anne", 20000, "4");
		
		Employee[] employees = {se1, se2, ce1, ce2};
		
		Employee tmp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j] = tmp;
				}
			}
		}
			
			for(Employee employee : employees) {
				System.out.println("ID #: " + employee.employeeid);
				System.out.println("Name: " + employee.employeeid);
				System.out.println("Pay: " + employee.calculatePay());
				System.out.println("******************");
			}
		
		
		
	}

}
