package l3;

public class Person {
	
	static String str = "Hello Java!";
	static {
		
		System.out.println(str);
	}
	
	private static Person person;
	
	public static Person getPerson() {
		if (person== null) {
			person = new Person();
		}
		return person;
	}
	
	private Person() {}
	
	
	private String name;

	public void print() {
		System.out.println(getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}