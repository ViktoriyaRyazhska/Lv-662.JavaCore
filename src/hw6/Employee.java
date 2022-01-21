package hw6;

public class Employee implements Payment,Comparable<Employee>{

    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(e.calculatePay(), this.calculatePay());
    }

}
