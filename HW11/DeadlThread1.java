package Lecture12;

public class DeadlThread1 extends Thread {

	private Object object1;
	private Object object2;

	public DeadlThread1(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	public void run() {
		synchronized (object2) {
			try {
				System.out.println("Object 2, thread2");
				DeadlThread.yield();
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (object1) {
				System.out.println("Object 1, thread2");
			}

		}
	}
}
