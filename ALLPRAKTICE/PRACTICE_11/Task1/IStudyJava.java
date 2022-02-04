package Task_11Praktice.Task1;

//Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).

public class IStudyJava {
    public static void main(String[] args) {
    try{
        for (int i = 0 ; i < 10;i++) {
            System.out.println("I study Java");
            Thread.sleep(1000);
            }
        }catch (InterruptedException e){
        System.err.println(" Something go wrong ");
    }
    }
}
