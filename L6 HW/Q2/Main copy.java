package l6HWQ2;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("Victoria", 19, 583599382.44);
		Developer d = new Developer("Katerina", 19);
		System.out.println(e.report());
		System.out.println(d.report());
	}

}
