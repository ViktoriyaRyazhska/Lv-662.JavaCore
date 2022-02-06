package hw6p1;


public class Employee implements Payment, Comparable<Employee>{

    private String employeeld;
    private String name;

    public Employee(String employeeld, String name){
        this.employeeld = employeeld;
        this.name = name;

    }

    @Override
    public String toString(){
        return "Employee: employeeID " + employeeld + ", name " + name + ", average monthly wage " + calculatePay();
    }


    @Override
    public int calculatePay() {
        return calculatePay();
    }

    @Override
    public int compareTo(Employee o) {
       if(this.name.compareTo(o.name) != 0)
           return this.name.compareTo(o.name);
       else
           return Integer.compare(this.calculatePay(), o.calculatePay());
    }
}
