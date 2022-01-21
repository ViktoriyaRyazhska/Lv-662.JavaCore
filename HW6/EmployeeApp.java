package HW6;

import java.util.ArrayList;
import java.util.List;
public class EmployeeApp{
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new ContractEmployee(120,"IO200","Max","387599"));
        list.add(new SalariedEmployee("984195","Ruslan","IO435",14000));
        list.add(new ContractEmployee(90,"IO342","Sergiy","497346"));
        list.add(new SalariedEmployee("984195","Denys","IO435",15400));

        for (Employee employee:list) {
            System.out.println(employee);
        }
        System.out.println("After sorting");


        list.sort(new SalComparator());

        for (Employee employee:list) {
            System.out.println(employee);
        }
    }

}
