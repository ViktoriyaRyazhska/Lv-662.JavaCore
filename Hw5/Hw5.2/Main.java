package java21;

public class Main {
public static void main(String[] args) {
		
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Влад", 21, 5000);
		employees[1] = new Developer("Олег", 43, " Java разработчик", 34657.4);
		employees[2] = new Employee("Валера", 50, 27456.78);
		employees[3] = new Employee("Денис", 25, 16456.78);
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].report());		
		}

		
	}

}
