package lesson_12.Practical;

public class Task_2 {
    public static void main(String[] args) {

        //Output two messages «Hello, world» and «Peace in the peace»
        // 5 times each with the intervals of 2 seconds, and the second - 3 seconds.
        // After printing messages, print the text «My name is …»

        Thread t1 = new MyThread("Hello, world", 500);
        Thread t2 = new MyThread("Peace in the peace", 1500);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException exception) {
            System.out.println("InterruptedException");
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException exception) {
            System.out.println("InterruptedException");
        }
        System.out.println("My name is Myrosia");

    }
}
