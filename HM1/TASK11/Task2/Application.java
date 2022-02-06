package Task_11HM.Task2;

//Cause a deadlock. Organize the expectations of ending a thread in main(),
// and make the end of the method main() in this thread.

import Task_11HM.Task1.ThreadsClass;

public class Application extends Thread {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (second){
                    Thread.yield();
                    synchronized (first){
                        System.out.println("Success!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
