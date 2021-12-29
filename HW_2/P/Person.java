package P;

//import java.util.Calendar;
//import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	private static int presentYear = 2021;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getPresentYear() {
		return presentYear;
	}

	public void setPresentYear(int presentYear) {
		this.presentYear = presentYear;
	}
	
    public void input(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
	public String output() {
		return "Person [first name " + firstName + ", last name " + lastName + ", birth year " + birthYear + "]";
	}
	
	public String changeName() {
		return changeName();		
	}
	
	public void setChangeName(String fn, String ln) {
      this.firstName = fn;
      this.lastName = ln;
	}
  
    public int getAge() {
	  return presentYear - birthYear;
	 }
  


	
//	public static int getAge(Date birthYear) {
//		Calendar today = Calendar.getInstance();
//		Calendar yearOfBirth = Calendar.getInstance();
//		
//		int age = 0;
//		
//		yearOfBirth.setTime(birthYear);
//		if (yearOfBirth.after(today)) {
//			throw new IllegalArgumentException("Can't be calculated. Future date!");
//		}
//		
//		age = today.get(Calendar.YEAR) - yearOfBirth.get(Calendar.YEAR);
//		
//		if ( (yearOfBirth.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3) || 
//				(yearOfBirth.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
//			age--;
//		} else if ((yearOfBirth.get(Calendar.MONTH) == today.get(Calendar.MONTH )) && 
//				(yearOfBirth.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))) {
//			age --;
//		}
//		
//		return age;
//		}
	
	public static void main(String[] args) {
		
    	Person p1 = new Person();
    	p1.setFirstName("Anna");
    	p1.setLastName("Kram");
    	p1.setBirthYear(1990);
    	p1.setChangeName("Tina", "Bura");
    	
    	Person p2 = new Person();
    	p2.setFirstName("Ira");
    	p2.setLastName("Bila");
    	p2.setBirthYear(2005);
    	
    	Person p3 = new Person();
    	p3.setFirstName("Sonya");
    	p3.setLastName("Kit");
    	p3.setBirthYear(1993);
    	
    	Person p4 = new Person("Yan", "Zinger");
    	p4.setBirthYear(2000);
    	
    	Person p5 = new Person("Taras", "Mudryk");
    	p5.setBirthYear(1998);
    	
    	System.out.println(p1.output());
    	System.out.println(p2.output());
    	System.out.println(p3.output());
    	System.out.println(p4.output());
    	System.out.println(p5.output());
    	
    	System.out.println(p1.getFirstName() + " " + p1.lastName + " is " + p1.getAge() + " years old.");
    	System.out.println(p2.getFirstName() + " " + p2.lastName + " is " + p2.getAge() + " years old.");
    	System.out.println(p3.getFirstName() + " " + p3.lastName + " is " + p3.getAge() + " years old.");
    	System.out.println(p4.getFirstName() + " " + p4.lastName + " is " + p4.getAge() + " years old.");
    	System.out.println(p5.getFirstName() + " " + p5.lastName + " is " + p5.getAge() + " years old.");
	}

	
	
}


