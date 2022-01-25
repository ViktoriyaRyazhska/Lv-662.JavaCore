package PracticeEight;

import java.util.Iterator;
import java.util.Map;

public class MapMethods {
    public static void addEmployee(Map map, Integer key, String value){
        map.put(key,value);
    }
    public static void printMap(Map map) {
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("ID :" + entry.getKey() + " -> Name : " +
                    entry.getValue());
        }
    }

    public static void searchingPersonForID(Map map, int id){
        if(map.containsKey(id) == true){
            System.out.println(map.get(id));
            }
        else {
            System.out.println("Sorry no user with this ID");
        }
        }
    public static void searchingPersonForName(Map map, String name){

    }
    }

