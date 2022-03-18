package l12HWQ1;

public class MyThread extends Thread {
	private int i;

	public MyThread(int i) {
		this.i = i;
	}

	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("Thread " + this.i + " running its number " + i + " iteration");
		}
	}
}
