package Task_8Praktice.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapTask {

    //In the main() method declare map employeeMap of pairs <Integer, String>.
    //Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
    //Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
    //Ask user to enter name, verify than you have name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()).

    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1, "Taras");
        employeeMap.put(2, "Oksana");
        employeeMap.put(3, "Tom");
        employeeMap.put(4, "Victoria");
        employeeMap.put(5, "Albert");
        employeeMap.put(6, "Kate");
        employeeMap.put(7, "Kit");
        System.out.println(employeeMap);
        System.out.println("enter your ID");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (employeeMap.containsKey(x)) {
            System.out.println("hello " + employeeMap.get(x));
        } else {
            System.out.println("Sorry , no user with this ID");
        }
        System.out.println("Pleas enter user Name");
        String Name = br.readLine();
        if(employeeMap.containsValue(Name)){
            for (Map.Entry<Integer,String> element : employeeMap.entrySet()) {
                if (Name.equals(element.getValue())) {
                    System.out.println("ID = " + element.getKey());
                }
            }
        }else{
            System.out.println("Sorry , no user with this Name");
        }
    }
}