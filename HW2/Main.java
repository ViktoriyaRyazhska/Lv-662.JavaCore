package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Person person1 = new Person();
        person1.input();

        Person person2 = new Person("Sasha", "Lutsenko");
        person2.setBirthYear(1999);

        Person person3 = new Person("Oleg", "Kravtsov");
        person3.changeName("Vika", "Lobavko");
        person3.setBirthYear(1945);

        Person person4 = new Person("Olga", "Varava");
        person4.input();

        Person person5 = new Person();
        person5.input();


        person1.output();
        System.out.println(person1.getFirstName() + "'s " + "age: " + person1.getAge());
        person2.output();
        System.out.println(person2.getFirstName() + "'s " + "age: " + person2.getAge());
        person3.output();
        System.out.println(person3.getFirstName() + "'s " + "age: " + person3.getAge());
        person4.output();
        System.out.println(person4.getFirstName() + "'s " + "age: " + person4.getAge());
        person5.output();
        System.out.println(person5.getFirstName() + "'s " + "age: " + person5.getAge());


    }
}
