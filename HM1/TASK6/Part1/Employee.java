package Task_6HM.Part1;

import java.util.Arrays;

public abstract class Employee implements Payment {

    //fields
    private String employeeld;


    //constructor

    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
    }


    //methods
    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public abstract String toString();

}
