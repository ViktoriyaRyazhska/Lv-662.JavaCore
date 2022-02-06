package Lecture12;

public class TwoThread extends Thread{
	private String two;
	
	public TwoThread(String w) {
		this.two = w;
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
	}
	
}
