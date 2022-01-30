package Task_7HM.Task1;

public class Student extends Person{

    private int course;

    Student(FullName fullName, int age,int course){
        super(fullName , age);
        this.setCourse(course);
    }
    public int getCourse(){
        return this.course;
    }
    public  void setCourse(int course){
        this.course = course;
    }
    @Override
    public void info() {
        System.out.println("Person first name is " + this.getFirstName());
        System.out.println("Person last name is " + this.getLastName());
        System.out.println("Person Age is " + getAge());
    }
    @Override
    public String activity() {
        return (this.getFirstName() + " study");
    }
}
