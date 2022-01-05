package PracticeTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Week {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name of the day ");
        Integer d = Integer.parseInt(br.readLine());

        switch (d){
            case 1:
                System.out.println(" Monday , Montag, Lundi ");
                break;
            case 2:
                System.out.println(" Tuesday , Dienstag, Mardi ");
                break;
            case 3:
                System.out.println(" Wednesday , Mittwoch, Mercredi ");
                break;
            case 4 :
                System.out.println(" Thursday , Donnerstag, Jeudi ");
                break;
            case 5:
                System.out.println(" Friday , Freitag, Vendredi ");
                break;
            case 6 :
                System.out.println(" Saturday , Samstag, Samedi ");
                break;
            case 7:
                System.out.println(" Sunday , Sonntag, Dimanche ");
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}
