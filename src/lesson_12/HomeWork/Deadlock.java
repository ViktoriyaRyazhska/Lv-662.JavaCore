package lesson_12.HomeWork;

public class Deadlock {
    public final static String r1 = "Locked r1";
    public final static String r2 = "Locked r2";

    public static void main(String[] args) {
        //Cause a deadlock.
        // Organize the expectations of ending a thread in main(),
        // and make the end of the method main() in this thread.

        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1: " + r1);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (r2) {
                        System.out.println("Thread 1: " + r2);
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run(){
                synchronized(r1){
                    System.out.println("Thread 2: " + r1);
                    try{ Thread.sleep(100);} catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(r2){
                        System.out.println("Thread 2: " + r2);
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }
}
