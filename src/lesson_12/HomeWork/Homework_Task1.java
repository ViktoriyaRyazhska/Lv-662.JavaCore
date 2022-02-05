package lesson_12.HomeWork;

public class Homework_Task1 {
    public static void main(String[] args) {
        // Run three threads and output there different messages for 5 times.
        // The third thread supposed to start after finishing working of the two previous threads.

        ThreadMain threadOne = new ThreadMain("Hello!");
        ThreadMain threadTwo = new ThreadMain("Bye!");
        ThreadMain threadTree = new ThreadMain("Hola!");
        threadOne.start();
        try {
            threadOne.join();
        } catch (InterruptedException exception) {
            System.out.println("InterruptedException");
        }
        threadTwo.start();
        try {
            threadTwo.join();
        } catch (InterruptedException exception) {
            System.out.println("InterruptedException");
        }
        threadTree.start();




    }
}
