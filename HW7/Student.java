package hw;

public class Student extends Person{

	private int course;
	
	public Student(String firsName, String lastName, int age, int course) {
		super(firsName, lastName, age);
		this.firstName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
	}
	
	@Override
	public String activity() {
		return " ";
	}
	@Override
	public String info() {
		return "Имя: " + firstName + ", фамилия: " + lastName + ", возраст: " + age + ", курс: " + course;
		
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}