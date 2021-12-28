package hw2;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("John");
		e1.setRate(10);
		e1.setHours(42);
		e1.changeRate(11);
		
		Employee e2 = new Employee("Emily", 13);
		e2.setHours(47);
		e2.changeRate(17);
		
		Employee e3 = new Employee("Mark", 33, 48);
		e3.changeRate(36);
		
		System.out.println(e1);
		System.out.println(e1.getName() + "'s salary is " + e1.getSalary() + "$");
		System.out.println(e1.getName() + "'s salary bonus is " + e1.getBonuses() + "$");
		System.out.println("\n" + e2);
		System.out.println(e2.getName() + "'s salary is " + e2.getSalary() + "$");
		System.out.println(e2.getName() + "'s salary bonus is " + e2.getBonuses() + "$");
		System.out.println("\n" + e3);
		System.out.println(e3.getName() + "'s salary is " + e3.getSalary() + "$");
		System.out.println(e3.getName() + "'s salary bonus is " + e3.getBonuses() + "$");
		System.out.println("\nTotal salary of all workers are: " + Employee.getTotalSum() + "$");

	}

}
