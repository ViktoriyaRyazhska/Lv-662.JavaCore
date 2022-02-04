package HW11;

public class ThreadOne implements Runnable {

    @Override
    public void run() {
        Thread t2 = new Thread(new ThreadTwo());
        t2.start();
    }


    class ThreadTwo implements Runnable {

        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread t3 = new Thread(new ThreadThree());
            t3.start();
        }
    }

    class ThreadThree implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        t1.start();
    }
}

