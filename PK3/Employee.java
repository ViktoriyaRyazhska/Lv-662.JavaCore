package java13;

public class Employee {
	private String name;
    private int departamentNumber ;
    private int salary;

public Employee(String name, int departamentNumber, int salary) {
    this.name = name;
    this.departamentNumber= departamentNumber;
    this.salary = salary;
}

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
}}

