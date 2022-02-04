package Lecture12;

public class iStudy {

	public static void main(String[] args) {
		Thread t = new StudyThread("I study Java");
		t.start();
		System.out.println("main");
	}

}


//Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).