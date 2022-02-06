package Task_11HM.Task3;

//Create a thread «one», which would start the thread «two», which has to output its number («Thread number two»)
// 3 times and create thread «three», which would to output message «Thread number three» 5 times

public class App {
    public static void main(String[] args) {
        Thread t1 = new ThreadOne("One");
        t1.start();
    }
}
