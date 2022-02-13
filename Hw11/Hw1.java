package hw11;

public class Hw1 {
	 public static void main(String[] args) {
	        ThreadMain threadOne = new ThreadMain("Yes");
	        ThreadMain threadTwo = new ThreadMain("No");
	        ThreadMain threadTree = new ThreadMain("Ok");
	        threadOne.start();
	        try {
	            threadOne.join();
	        } catch (InterruptedException exception) {
	            System.out.println("InterruptedException");
	        }
	        threadTwo.start();
	        try {
	            threadTwo.join();
	        } catch (InterruptedException exception) {
	            System.out.println("InterruptedException");
	        }
	        threadTree.start();




	    }
}
