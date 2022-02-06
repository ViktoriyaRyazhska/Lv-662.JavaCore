package Task_11HM.Task3;

public class ThreadTwo extends Thread{

    //field
    private String text;

    //constructor
    public ThreadTwo(String text) {
        this.text = text;
    }

    //method
    public void run(){
        for (int i = 0 ; i < 3 ; i ++){
            System.out.println(text);
        }
        Thread t3 = new ThreadThree("Thread number three");
        t3.start();
    }
}
