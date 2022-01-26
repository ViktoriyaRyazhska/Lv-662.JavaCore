package l8HWQ1;

public class Student extends Person{
	private String course;

	Student(FullName fullname, int age, String course) {
		super(fullname, age);
		this.setCourse(course);
		
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override 
	public void info() {
		System.out.println("First name: " + this.getFirstName() + ", Last name: " + this.getLastName()  + ", Age: " + this.getAge() + ", Course: " + this.getCourse());
	}

	@Override
	public String activity() {
		return ("I'm " + this.getFirstName() + " and I'm a student.");
		
	}

}
