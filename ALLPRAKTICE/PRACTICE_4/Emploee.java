package Task_4Praktice;

public class Emploee {

        //fields
        private String name;
        private int departamentNumber ;
        private int salary;

    //constructors
    public Emploee(String name, int departamentNumber, int salary) {
        this.name = name;
        this.departamentNumber= departamentNumber;
        this.salary = salary;
    }

        //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartamentNumber() {
        return departamentNumber;
    }

    public void setDepartamentNumber(int departamentNumber) {
        this.departamentNumber = departamentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


