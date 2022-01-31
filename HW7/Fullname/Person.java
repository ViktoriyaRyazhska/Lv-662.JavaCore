package Fullname;

public abstract class Person extends FullName {
	
	private FullName fullName = new FullName();
	protected int age;
	
	public Person(String firsName, String lastName, int age) {
        fullName.firstName = firsName;
        fullName.lastName = lastName;
        this.age = age;
    }
	
	public String info() {
		return "First name: <firstName> " + firstName + ", Last name: <lastName>" + lastName + ", Age=" + age + "]";
		
	}
	
	abstract public String activity();
	
	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
