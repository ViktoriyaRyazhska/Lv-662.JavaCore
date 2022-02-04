package Lecture12;

public class MyThread extends Thread{
	
	String first;

	
	public MyThread(String a) {
		first = a;

	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(first);
		}
	}

}
