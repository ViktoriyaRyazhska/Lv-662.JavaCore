package Employee;

public class MainEmpl {
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Ivan", 28, 33447.8);
		employees[1] = new Developer("Taras", 32, "Average Java developer", 32735.35);
		employees[2] = new Employee("Anton", 35, 28447.8);
		employees[3] = new Employee("Max", 25, 31447.8);
		
		for (int i = 0; i < employees.length; i++) {
			// System.out.println("Name: " + employees[i].getName() + ". Age: " + employees[i].getAge() + ". Position: " + ". Salary: " + employees[i].getSalary());

			System.out.println(employees[i].report());		
		}

		
	}

}
