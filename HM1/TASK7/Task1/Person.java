package Task_7HM.Task1;

public abstract class Person extends FullName{

    private int Age;

    Person(FullName fullName, int Age){
        super(fullName.getFirstName(), fullName.getLastName());
        this.setFirstName(fullName.getFirstName());
        this.setLastName(fullName.getLastName());
        this.setAge();
    }

    public void info(){
        System.out.println("Person first name is " + this.getFirstName());
        System.out.println("Person last name is " + this.getLastName());
        System.out.println("Person Age is " + getAge());
    }

    public abstract String activity();

    public int getAge(){
        return this.Age;
    }
    public  void setAge(){
        this.Age = Age;
    }
}
