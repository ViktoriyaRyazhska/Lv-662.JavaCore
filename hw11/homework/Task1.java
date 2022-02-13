package hw11.homework;

import hw11.practice.MyThread;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("--- Task 1 ---");
		MyThread thread1 = new MyThread("I am thread number one.", 1000, 5);
		MyThread thread2 = new MyThread("I am thread number two.", 2000, 5);
		MyThread thread3 = new MyThread("I am thread number three.", 500, 5);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread3.start();
	}

}
