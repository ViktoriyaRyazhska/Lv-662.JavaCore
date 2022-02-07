package com.company;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Sasha", "Grischenko", 19, 2);
        System.out.println(st1.info() + '\n' + st1.activity());
        Student st2 = new Student("Grisha", "Panamorev", 20, 3);
        System.out.println(st2.info() + '\n' + st2.activity());



    }
}
