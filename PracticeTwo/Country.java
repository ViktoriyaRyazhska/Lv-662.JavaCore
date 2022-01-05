package PracticeTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter country name ");
        String c = br.readLine();

        Continen continen = Continen.ASIA;


        switch (c){
            case "Ukraine" : case "England": case "Poland": case "France":
            continen = Continen.EUROPE;break;
            case "China" : case "India": 
                continen = Continen.ASIA;break;
            case "Canada" : case "America":
                continen = Continen.NORTHAMERICA;break;
            case "Chili" : 
                continen = Continen.SOUTHAMERICA;break;
            case  "Tanzania":
                continen = Continen.AFRICA;break;
            case "Australia":
                continen = Continen.AUSTRALIA;break;
            default:
                System.out.println("Wrong input");
                System.exit(0);
        }
        System.out.println(continen);
    }
}
