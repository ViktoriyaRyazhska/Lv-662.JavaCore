package hw2;

public class App {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Ivan");
		e1.setRate(15);
		e1.setHours(10);
		
		Employee e2 = new Employee("Olga", 20);
		e2.setHours(30);
		
		Employee e3 = new Employee("Petro", 50, 20);
		
		e3.changeRate(25);
		
		System.out.println(Employee.getTotalSum());
	}

}
