package hw11.practical1;

public class TenTimes extends Thread {
    public static void main(String[] args) {
        String text = "I study Java";

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(text);
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
    }
}
