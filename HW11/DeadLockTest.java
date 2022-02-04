package HW11;

public class DeadLockTest {
    private static Integer numberOne = 5;
    private static Integer numberTwo = 10;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (numberOne) {
                    Thread.yield();
                    synchronized (numberTwo) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (numberTwo) {
                    Thread.yield();
                    synchronized (numberOne) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}


