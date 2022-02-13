package hw11;

public class Hw2 extends Thread {
    public final static Object one = new Object();
    public final static Object two = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (one) {
                    Thread.yield();
                    synchronized (two) {
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (two){
                    Thread.yield();
                    synchronized (one){
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
