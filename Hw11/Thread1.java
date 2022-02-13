package hw11;

public class Thread1 extends Thread {
	private String text;
    public Thread1(String text) {
        this.text = text;
    }

    public void run(){
      Thread t2 = new Thread2("Поток номер 2");
      t2.start();
    }
}
