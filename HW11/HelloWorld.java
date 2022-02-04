package Lecture12;

public class HelloWorld {

	public static void main(String[] args) {
		
		Thread t = new HWThread("Hello, World!" , 1000);
		t.start();
		Thread t1 = new HWThread("Peace in the peace" , 500);
		t1.start();
		
		try {
			t.join( );
			t1.join( );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My name is Lily.");

	}

}

