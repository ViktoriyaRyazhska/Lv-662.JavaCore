package l12HWQ1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread(1);
		MyThread t2 = new MyThread(2);
		MyThread t3 = new MyThread(3);

		t1.start();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}

}
