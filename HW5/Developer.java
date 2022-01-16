package HW5;

public class Developer extends Employee{
    String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Developer(String position){
        super();
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name : %s , Age: %d, Position: %s, Salary : %.2f. \u20B4",getName(),getAge(),position,getSalary());
    }

}

class DeveloperApp {
    public static void main(String[] args) {
        Developer d1 = new Developer("Junior");
        d1.setName("John");
        d1.setAge(21);
        d1.setSalary(9500d);

        Employee d2 = new Employee("Max", 22, 9000);

        Developer d3 = new Developer("FrontEndDeveloper");
        d3.setName("Sergiy");
        d3.setAge(22);
        d3.setSalary(10000d);


        System.out.println(d1.report());
       System.out.println(d2.report());
       System.out.println(d3.report());
    }
}
