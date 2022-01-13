package PracticeThree;

public class Employee {
    private  String name;
    private  int salary;
    private  int departmentNumber;


    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }




    public  void input(String name,  int departmentNumber,int salary){
        System.out.println("Enter name, Department number, and salary of  person");
        this.setName(name);
        this.setDepartmentNumber(departmentNumber);
        this.setSalary(salary);
    }


    @Override
    public String toString() {
      return "Name: '" + this.name + "', DepartmentNumber: '" + this.departmentNumber + "', salary: '" + this.salary + "'";
   }
}
