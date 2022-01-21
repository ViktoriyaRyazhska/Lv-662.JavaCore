package hw6;

import java.util.Arrays;

public class PaymentApp {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];

        emp[0] = new SalariedEmployee("Gina", "078-05-1120", 34, 160);
        emp[1] = new ContractEmployee("Jake", "123-456-7890", 4000);
        emp[2] = new SalariedEmployee("Terry", "048-25-2230", 51, 160);
        emp[3] = new ContractEmployee("Emmy", "123-123-7777", 4200);

        Arrays.sort(emp);

        for ( Employee i: emp) {
            System.out.println(i);
            System.out.println("Monthly Wage: " + i.calculatePay() + "\u0024\n");
        }
    }
}
