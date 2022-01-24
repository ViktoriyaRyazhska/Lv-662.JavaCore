package hw7.homework_1;

public abstract class Person {
	
	protected FullName fullName;
	protected int age;
	
	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}
	
	public String getFirstName() {
		return fullName.getFirstName();
	}
	
	public String getLastName() {
		return fullName.getLastName();
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		fullName.setFirstName(firstName);;
	}
	
	public void setLastName(String lastName) {
		fullName.setLastName(lastName);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		return "First name: " + fullName.getFirstName() + ", " +  
		       "Last name: " + fullName.getLastName() + ", " +
		       "Age: " + age;
	}
	
	public abstract String activity();
	
}
