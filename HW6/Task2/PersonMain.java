package Task2;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		persons[0] = new Teacher();
		persons[1] = new Cleaner();
		persons[2] = new Student();
		
		for (int i = 0; i < persons.length; i++) {
			persons[i].print();
			if (persons[i] instanceof Staff) {
				((Staff)persons[i]).salary();
			}
		}
		
	}
}
