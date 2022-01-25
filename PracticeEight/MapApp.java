//In the main() method declare map employeeMap of pairs <Integer, String>.
//
//    Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
//
//    Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
//
//    Ask user to enter name, verify than you have name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()).

package PracticeEight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        MapMethods.addEmployee(employeeMap,1,"John");
        MapMethods.addEmployee(employeeMap,2,"Max");
        MapMethods.addEmployee(employeeMap,3,"Sergiy");
        MapMethods.addEmployee(employeeMap,4,"Ruslan");
        MapMethods.addEmployee(employeeMap,5,"Anton");

        MapMethods.printMap(employeeMap);

        System.out.println("Enter ID of searching person");
        Integer id = Integer.parseInt(br.readLine());

        MapMethods.searchingPersonForID(employeeMap,id);

        System.out.println("Pleas enter user Name");
        String Name = br.readLine();

        if(employeeMap.containsValue(Name)){
           for (Map.Entry<Integer, String> element: employeeMap.entrySet()) {
               if (Name.equals(element.getValue())) {
                   System.out.println("ID = " + element.getKey());
               }
           }
        }else{
            System.out.println("Sorry , no user with this Name");
        }
    }

}
