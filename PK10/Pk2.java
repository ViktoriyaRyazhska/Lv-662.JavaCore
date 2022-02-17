package hw12;

public class Pk2 {

	public static void main(String[] args) {
		Thread t1 = new MyThread("Hello, world", 1000);
        Thread t2 = new MyThread("Peace in the peace", 3000);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.err.println("InterruptedException");
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("InterruptedException");
        }
        System.out.println("My name is Alexandra");

    
	}

}
