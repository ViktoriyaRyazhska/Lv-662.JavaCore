package hw11;

public class Thread3 extends Thread {
    private String text;

    public Thread3(String text) {
        this.text = text;
    }

    public void run (){
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(text);
        }
    }
}
