package Lecture12;

public class Deadlock {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) {
	   Thread t1 = new Thread() {
	   public void run() {
	      synchronized (first) {
	         Thread.yield();
	         synchronized (second) {
	            System.out.println("Success1!");
	   }  }  }  };

	
	Thread t2 = new Thread() {
		   public void run() {
		      synchronized (second) {
		         Thread.yield();
		         synchronized (first) {
		            System.out.println("Success2!");
		         }
		      }
		   }
		};
		t1.start();
		t2.start();
		}

}


//Cause a deadlock. Organize the expectations of ending a thread in main(), 
//and make the end of the method main() in this thread.