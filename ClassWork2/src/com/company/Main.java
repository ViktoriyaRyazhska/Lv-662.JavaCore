package com.company;

public class Main {

    public static void main(String[] args) {
     Employee a1 = new Employee();
     a1.setName("Katya");
     a1.setRate(10);
     a1.setHours(13);


     Employee a2 = new Employee("Kolya", 9);
     a2.setHours(25);
     a2.changeRate(13);


     Employee a3 = new Employee("Sergiy",6,30);

        System.out.println(a1.toString() + '\n' + a2.toString() + '\n' + a3.toString() + '\n');
        System.out.println("Salary " + a2.getName() + "'s " + a2.getSalary() + " " + "Bonuses: " + a2.getBonuses() + '\n');
        System.out.println(a1.getName() + "'s " + "Salary " + a1.getSalary() + '\n'
                + a2.getName() + "'s " + "Salary " + a2.getSalary() + '\n'
                + a3.getName() + "'s " + "Salary " + a3.getSalary() + '\n'
                + "Total Salary: " + Employee.getTotalSum());
    }
}
