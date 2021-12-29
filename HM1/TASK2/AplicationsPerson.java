package Task_2HM;

public class AplicationsPerson {
    public static void main(String[] args) {
        //person1
        Person person1 = new Person("Nikola","Tesla");
        person1.setBirthYear(1856);

        //person2
        Person person2 = new Person("Anton","Shcherbei");
        person2.setBirthYear(2001);

        //person3
        Person person3 = new Person("Vlad","Drakula");
        person3.setBirthYear(1400);

        //person4
        Person person4 = new Person("Ted","Lorenson");
        person4.setBirthYear(1991);

        //person5
        Person person5 = new Person("Artur","Doil");
        person5.setBirthYear(1893);

        //output information about all persons
        System.out.println(person1.output());
        System.out.println(person2.output());
        System.out.println(person3.output());
        System.out.println(person4.output());
        System.out.println(person5.output());

        //age all persons
        System.out.println(person1.getFirstName() + " = " + person1.getAge(person1.getBirthYear()));
        System.out.println(person2.getFirstName() + " = " + person2.getAge(person2.getBirthYear()));
        System.out.println(person3.getFirstName() + " = " + person3.getAge(person3.getBirthYear()));
        System.out.println(person4.getFirstName() + " = " + person4.getAge(person4.getBirthYear()));
        System.out.println(person5.getFirstName() + " = " + person5.getAge(person5.getBirthYear()));


    }
}
