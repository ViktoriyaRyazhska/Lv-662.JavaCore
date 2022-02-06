package Lecture12;

public class Deadlockk {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		DeadlThread t1 = new DeadlThread(object1, object2);
		t1.start();
		DeadlThread t2 = new DeadlThread(object2, object1);
		t2.start();
	}

}
