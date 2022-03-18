package l12HWQ3;

public class Main {

	static Thread t1 = new Thread() {
		public void run() {
			t2.start();

		}
	};

	static Thread t2 = new Thread() {
		public void run() {
			for (int i = 0; i < 3; ++i) {
				System.out.println("Thread Number 2");
			}

		}
	};

	static Thread t3 = new Thread() {
		public void run() {
			for (int i = 0; i < 5; ++i) {
				System.out.println("Thread Number 3");
			}

		}
	};

	public static void main(String[] args) throws InterruptedException {

		t1.start();
		t1.join();
		t3.start();
		t3.join();

	}

}
