package lesson_12.Practical;

public class Task_1 extends Thread {

    //Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);)

    public static void main(String[] args) {
        String string = "I study Java";

        for (int i = 0; i < 10; i++) {
            System.out.println(string);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Eror" + e.getMessage());
            }
        }

    }

}

