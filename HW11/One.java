package Lecture12;

public class One {

	public static void main(String[] args) {
		OneThread t1 = new OneThread("");
		TwoThread t2 = new TwoThread("");
		ThreeThread t3 = new ThreeThread("");
		
		t1.start();
		t2.start();
		t3.start();

			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}


//Create a thread «one», which would start the thread «two», 
//which has to output its number («Thread number two») 3 times and create thread «three», 
//which would to output message «Thread number three» 5 times.
