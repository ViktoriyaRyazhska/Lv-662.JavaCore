package Lecture12;

public class StudyThread extends Thread{
	
	private String msg;
	
	StudyThread(String msg) {
		this.msg = msg;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(msg);
			} catch (InterruptedException e) {}
			
		} 
		System.out.println(msg);
	}

}
