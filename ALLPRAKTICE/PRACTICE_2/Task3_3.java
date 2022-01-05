package Task_3Practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task3_3 {

    public enum Contenent {
        Europe , Asia , Africa , NorthAmerika , SouthAmerica , Australia
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter country name");
        String country = br.readLine();
        Contenent contenent = null;

        switch(country){
            case "Ukrain":
            case "Poland":
            case "Italy":
                contenent = Contenent.Europe;
                break;
            case "China":
            case "Japan":
            case "India":
                contenent = Contenent.Asia;
                break;
            case "Washington":
            case "New York":
            case "New colorado":
                contenent = Contenent.NorthAmerika;
                break;
            default:
                System.out.println("I don`t know this country");
        }
        System.out.println(contenent);
    }
}

