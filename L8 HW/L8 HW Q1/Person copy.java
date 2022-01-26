package l8HWQ1;

//public abstract class Person <Fullname> implements Cloneable {
//	private Object fullname = new FullName();
//	private int Age;
//	
//	Person(Fullname fullname, int age) throws CloneNotSupportedException {
//		this.fullname = super.clone();
//		this.Age = age;
//	}
//	
//	public void info() {
//		System.out.println("First name: " + ((FullName) fullname).getFirstName() + ", Last name: " + ((FullName) fullname).getLastName()  + ", Age: " + this.Age);
//	}
//	
//
//}

public abstract class Person extends FullName {
	private int Age;
	
	Person(FullName fullname, int age) {
		super(fullname.getFirstName(), fullname.getLastName());
//		this.setFirstName(fullname.getFirstName());
//		this.setLastName(fullname.getLastName());
		this.setAge(age);
	}
	
	public void info() {
		System.out.println("First name: " + this.getFirstName() + ", Last name: " + this.getLastName()  + ", Age: " + this.getAge());
	}
	
	public abstract String activity();

	public int getAge() {
		return this.Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	

}
