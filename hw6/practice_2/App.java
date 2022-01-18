package hw6.practice_2;

public class App {

	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		
		persons[0] = new Cleaner("Neo");
		persons[1] = new Student("John");
		persons[2] = new Teacher("Marco");
		
		for (Person person : persons) {
			
			person.print();
			
			if (person instanceof Staff) {
				
				((Staff) person).salary();
				
			}
			
		}

	}

}
