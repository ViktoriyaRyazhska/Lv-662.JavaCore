package hw11.practice;

public class MyThread extends Thread {

	private String message;
	private int pause;
	private int count;

	public MyThread(String message, int pause, int count) {
		this.message = message;
		this.pause = pause;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
			try {
				sleep(pause);
			} catch (InterruptedException e) {
				System.err.println("Pause has been interrupted.");
				e.printStackTrace();
			}
		}
	}
}
