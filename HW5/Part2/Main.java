package com.company;

public class Main {

    public static void main(String[] args) {

        Employee em1 = new Employee("Sasha", 23, 32423);
        Employee em2 = new Developer("Kolya", 21, 32134, "Java Developer");
        Developer em3 = new Developer("Olya", 26, 12300, "HR");

        System.out.println(em1.report());
        System.out.println(em2.report());
        System.out.println(em3.report());
    }
}
