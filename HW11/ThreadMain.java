package hw11;

public class ThreadMain extends Thread{
	 String message;

	    public ThreadMain(String message) {
	        this.message = message;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(message);
	        }
}
}