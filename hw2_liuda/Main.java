package pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();




        person1.input(br);
        person2.input(br);
        person3.input(br);
        person4.input(br);
        person5.input(br);

        person1.getAge();
        person2.getAge();
        person3.getAge();
        person4.getAge();
        person5.getAge();

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        person1.changeName(br);
        person2.changeName(br);
        person3.changeName(br);
        person4.changeName(br);
        person5.changeName(br);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();


    }
}
