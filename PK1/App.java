package java9;

public class App {

	public static void main(String[] args) {
		Employee s1 = new Employee();
		s1.setName("olga");
		s1.setRait(50);
		s1.setHours(8);
		s1.getSalary();

		Employee s2 = new Employee("Dima",4);
		s2.setName("vlad");
		s2.setRait(15);
		s2.setHours(8);
		s2.getSalary();

		Employee s3 = new Employee("Ivan",6,10);
		s3.setName("ivan");
		s3.setRait(25);
		s3.setHours(8);
		s3.getSalary();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.getSalary());
        System.out.println(s2.getSalary());
        System.out.println(s3.getSalary());

        System.out.println(s1.getBonuses() + " bonus");
        System.out.println(s2.getBonuses() + " bonus");
        System.out.println(s3.getBonuses() + " bonus");
	}
}
