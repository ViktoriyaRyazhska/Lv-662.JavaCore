package hw6p1;

import java.util.Arrays;
import java.util.Comparator;

public class MainEmployee {
    public static void main(String[] args) {

        Employee[] employee= new Employee[4];
        employee[0] = new ContractEmployee("0895", "Ivanchenko", 26000, "922-33-4547");
        employee[1] = new SalariedEmployee("1547", "Petrenko", 13000, "105244879");
        employee[2] = new ContractEmployee("1122", "Fedenko", 16800, "954-87-2050");
        employee[3] = new SalariedEmployee("2155", "Pavlenko", 22500, "224060888");

        Arrays.sort(employee, Comparator.reverseOrder());


        for (Employee value : employee) {
            System.out.println(value);

        }
    }
}
