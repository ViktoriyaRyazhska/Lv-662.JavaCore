package HW2;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Sergiy","Okhota");
        p1.setBirthYear(2000);

        Person p2 = new Person("Anton", "Denisov");
        p2.changeName("Denis", "Smetanyak");
        p2.setBirthYear(2001);

        Person p3 = new Person("Ira", "Sotnyk");
        p3.setBirthYear(2002);

        Person p4 = new Person("Oleksandr", "Vasilyev");
        p4.setBirthYear(2003);

        Person p5 = new Person();
        p5.input("Ruslan", "Svaleba",1996);

        System.out.println(p1.output());
        System.out.println(p2.output());
        System.out.println(p3.output());
        System.out.println(p4.output());
        System.out.println(p5.output());

        System.out.println("Person age is " + p1.getAge());
        System.out.println("Person age is " + p2.getAge());
        System.out.println("Person age is " + p3.getAge());
        System.out.println("Person age is " + p4.getAge());
        System.out.println("Person age is " + p5.getAge());




    }
}
