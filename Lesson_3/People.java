package intra.Lesson_3;

public class People {
	public static void main (String[] args) {
		Employee e1 = new Employee();
		
		e1.setName("olga");
		e1.setRate(50);
		e1.setHours(10);
		
		Employee e2 = new Employee("igor", 35);
		e2.setHours(8);
		
		Employee e3 = new Employee("ivan", 70, 12);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
		System.out.println(e3.getSalary());
		
		System.out.println();
		
		System.out.println(Employee.getTotalSum());
		System.out.println();
		System.out.println(e1.getBonuses());
		System.out.println(e2.getBonuses());
		System.out.println(e3.getBonuses());

	}
}
		

	
