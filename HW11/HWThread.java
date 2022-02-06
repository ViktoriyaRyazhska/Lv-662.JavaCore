package Lecture12;

public class HWThread extends Thread{
	
	private String msg1;
	private int p;
	
	HWThread(String msg1, int p){
		this.msg1 = msg1;
		this.p = p;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(p);
				System.out.println(msg1);

			} catch (InterruptedException e) {}
		}
		System.out.println(msg1);

	}

}
