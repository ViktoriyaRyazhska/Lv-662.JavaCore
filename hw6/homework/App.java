package hw6.homework;

import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[5];
		
		staff[0] = new SalariedEmployee("Bill", "646", "265984", 3000);
		staff[1] = new ContractEmployee("Ben", "784", "523987", 25, 160);
		staff[2] = new SalariedEmployee("Joseph", "523", "589632", 4500);
		staff[3] = new ContractEmployee("Matilda", "385", "456289", 30, 120);
		staff[4] = new SalariedEmployee("James", "128", "753914", 3700);
		
		Arrays.sort(staff, Comparator.reverseOrder());
		
		for (Employee employee : staff) {
			System.out.println(employee);
		}
		
	}

}
