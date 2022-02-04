package Task_11Praktice.Task2;

public class ThreadsClass extends Thread{

   //fields
    private int pause;
    private String sentence;

    //constructor
    public ThreadsClass(int pause, String sentence) {
        this.pause = pause;
        this.sentence = sentence;
    }

    public void run (){
        for (int i = 0; i < 5 ; i++){
            try{
                sleep(pause);
            }catch(InterruptedException e){
                System.err.println("Interrupt Exception " + e.getMessage());
            }
            System.out.println(sentence);
        }
    }
}
