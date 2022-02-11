package PracticalTasks_2;

public class Appl {

	public static void main(String[] args) {

		Employee e1 = new Employee("Vasyl", 3);
		e1.setHours(16);
		e1.changeRate(6);

		Employee e2 = new Employee();
		e2.setName("Solomiya");
		e2.setRate(5);
		e2.changeRate(6);
		e2.setHours(26);

		Employee e3 = new Employee("Myron", 4, 18);

		// Info about employees
		System.out.println(e1 + "\n" + e2 + "\n" + e3 + "\n");

		// Total salary of all employees
		System.out.println("\nTotal salary of all employees:\n" + Employee.getTotalSum() + " $");

		// Total salary with bonuses
		System.out.println("\nTotal salary of all employees with bonuses is:\n" + (e1.getSalaryWithBonuses()
				+ e2.getSalaryWithBonuses() + e3.getSalaryWithBonuses()) + " $");
	}

}
