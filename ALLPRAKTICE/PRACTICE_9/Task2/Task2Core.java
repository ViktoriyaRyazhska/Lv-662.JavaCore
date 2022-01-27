package Task_9Praktice.Task2;

public class Task2Core {

    public static String Name(String[] arr){
        return arr[0];
    }

    public static String SurnameAndInitials(String[] arr){
        return arr[1] + " " + arr[0].substring(0,1) + " . " + arr[2].substring(0,1) + " .";
    }
}
