package java24;

import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new ContractEmployee(12,"I0986","Дмитрий","789594"));
        list.add(new SalariedEmployee("867594","Андрей","I6565",60000));
        list.add(new ContractEmployee(18,"I0595","Олег","090909"));
        list.add(new SalariedEmployee("454545","Влад","I0678",3000));

        for (Employee employee:list) {
            System.out.println(employee);
        }
        System.out.println("    ");


        list.sort(new SalComparator());

        for (Employee employee:list) {
            System.out.println(employee);
        }
    }

}