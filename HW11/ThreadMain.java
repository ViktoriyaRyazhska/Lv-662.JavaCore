package HW11;

public class ThreadMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Message one"));
        Thread t2 = new Thread(new MyThread("Message two"));
        Thread t3 = new Thread(new MyThread("Message three"));
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
    }

