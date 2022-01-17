package Task_5HM.Part2;

public class Emploee {

   //fields
    private String name;
    private int age;
    private double salary;

    //constructor
    public Emploee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //methods
    public String report(){
        return String.format("Name: %s, Age: %s,Salary: \u20b4 %.2f", name,age,salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
