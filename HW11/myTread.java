package Lecture12;

public class myTread {
	
	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread("1");
		MyThread myThread2 = new MyThread("2");
		MyThread myThread3 = new MyThread("3");
		
		myThread1.start();
		myThread2.start();
		
		try {
			myThread1.join( );
			myThread2.join( );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myThread3.start();
	}
	
}

//The third thread supposed to start after finishing working of the two previous threads.
