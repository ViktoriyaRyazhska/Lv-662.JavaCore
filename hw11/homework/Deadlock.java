package hw11.homework;

public class Deadlock {

	public static void main(String[] args) {

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
