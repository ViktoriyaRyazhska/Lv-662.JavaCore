package prTask3p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public enum Continent {
    EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, AUSTRALIA;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Country name");
        String country = br.readLine();



        switch (country) {
            case "Ukraine": case "Poland": case "France":
                System.out.println(EUROPE);
                break;
            case "India": case "China": case "Japan":
                System.out.println(ASIA);
                break;
            case "Egypt": case "Ethiopia": case "Guinea":
                System.out.println(AFRICA);
                break;
            case "USA": case "Canada": case "Dominican Republic":
                System.out.println(NORTH_AMERICA);
                break;
            case "No countries":
                System.out.println(SOUTH_AMERICA);
                break;
            case "Arctica":
                System.out.println(ANTARCTICA);
                break;
            case "Australia": case "Papua New Guinea": case "New Zealand":
                System.out.println(AUSTRALIA);
                break;
            default:
                System.out.println("Not found any Continent");
                break;

        }
    }

}




