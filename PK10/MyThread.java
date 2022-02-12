package hw12;

public class MyThread extends Thread {
	String string;
    private String text;
    private int pause;

    public MyThread(String text, int pause) {
        this.text = text;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread  " + text);
        }
    }

}
