package HW2;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Marki", "Bushko");
        p1.setBirthYear(2004);
        Person p2 = new Person("Dima", "Boyko", 2003);
        Person p3 = new Person();
        p3.setFirstName("Sergiy");
        p3.setLastName("Furtas");
        p3.setBirthYear(2003);
        Person p4 = new Person();
        p4.input("Vasyl", "Melnyk", 2000);
        Person p5 = new Person();
        p5.setFirstName("Ihor");
        p5.setLastName("Shpuk");
        p5.setBirthYear(2003);
        String p1getfn = p1.getFirstName();
        String p1getln = p1.getLastName();
        int p1getby = p1.getBirthYear();
        int p1getage = p1.getAge();
        String p2getfn = p2.getFirstName();
        String p2getln = p2.getLastName();
        int p2getby = p2.getBirthYear();
        int p2getage = p2.getAge();
        String p3getfn = p3.getFirstName();
        String p3getln = p3.getLastName();
        int p3getby = p3.getBirthYear();
        int p3getage = p3.getAge();
        String p4getinfo = p4.output();
        int p4getage = p4.getAge();
        String p5getfn = p5.getFirstName();
        String p5getln = p5.getLastName();
        int p5getby = p5.getBirthYear();
        int p5getage = p5.getAge();
        System.out.println(p1getfn + " " + p1getln + " " + p1getby + " " + p1getage + "years");
        System.out.println(p2getfn + " " + p2getln + " " + p2getby + " " + p2getage + "years");
        System.out.println(p3getfn + " " + p3getln + " " + p3getby + " " + p3getage + "years");
        System.out.println(p4getinfo + " " + p4getage + " years");
        System.out.println(p5getfn + " " + p5getln + " " + p5getby + " " + p5getage + "years");
    }
}