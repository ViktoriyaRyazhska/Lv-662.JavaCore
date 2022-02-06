package Lecture12;

public class ThreeThread extends Thread {
	
	private String three;
	
	public ThreeThread(String t) {
		this.three = t;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}
	}

}
