package Lecture12;

public class DeadlThread extends Thread{

	private Object object1;
	private Object object2;
	
	public DeadlThread(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}
	
	public void run() {
		synchronized (object1) {
			try {
				System.out.println("Object 1, thread1");
				DeadlThread.yield();
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (object2) {
					System.out.println("Object 2, thread1");

			}
		}
	}
	
}
