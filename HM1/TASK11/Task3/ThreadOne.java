package Task_11HM.Task3;

public class ThreadOne extends Thread{

    //fields
    private String text;

    //constructor


    public ThreadOne(String text) {
        this.text = text;
    }

    //method
    public void run(){
        System.out.println("One");
      Thread t2 = new ThreadTwo("Thread number two");
      t2.start();
    }
}
