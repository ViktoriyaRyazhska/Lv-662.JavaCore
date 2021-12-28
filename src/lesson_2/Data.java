package lesson_2;

public class Data {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anna", 6, 9);
		
		Employee e2 = new Employee();
		e2.setName("Mariia");
		e2.setRait(4);
		e2.setHours(8);
		e2.changeRate(11);
		
		Employee e3 = new Employee("John", 6);
		e3.setHours(8);
		
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		System.out.print("Salary employee 1 ");
		System.out.println(e1.getSalary());
		System.out.print("Salary employee 2 ");
		System.out.println(e2.getSalary());
		System.out.print("Salary employee 3 ");
		System.out.println(e3.getSalary());
	
		
		System.out.print("Total Salary of all employees ");
		System.out.println(Employee.getTotalSum());
		
		System.out.print("Bonuses of employee 1 ");
		System.out.println(e1.getBonuses());
		System.out.print("Bonuses of employee 2 ");
		System.out.println(e2.getBonuses());
		System.out.print("Bonuses of employee 3 ");
		System.out.println(e3.getBonuses());
		
		
		
		
	}


}
