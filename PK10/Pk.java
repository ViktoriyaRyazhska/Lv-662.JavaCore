package hw12;

public class Pk extends Thread{

	 public static void main(String[] args) {
	        String s = "I study Java";

	        for (int i = 0; i < 10; i++) {
	            System.out.println(s);

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                System.err.println("Eror" + e.getMessage());
	            }
	        }

	    }

	}
