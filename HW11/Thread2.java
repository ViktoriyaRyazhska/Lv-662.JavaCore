package hw11;

public class Thread2 extends Thread {
	 private String text;

	    public Thread2(String text) {
	        this.text = text;
	    }
	    public void run(){
	        for (int i = 0 ; i < 3 ; i ++){
	            System.out.println(text);
	        }
	        Thread t3 = new Thread3("Поток номер 3");
	        t3.start();
	    }
}
