package Task_7HM.Task1;

public class App {
    public static void main(String[] args) {

        //instance1
        FullName per1 = new FullName("Ruslan","Sveleba");
        Student st1 = new Student(per1,21,4);
        //call method info
        st1.info();
        System.out.println(st1.activity());

        //instance2
        FullName per2 = new FullName("Smetanyak","Denus");
        Student st2 = new Student(per2,21,5);
        st2.info();
        System.out.println(st2.activity());
    }
}
