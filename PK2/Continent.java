import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continent {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Name yhe country");
		String country = br.readLine();

		cont continent = cont.Wrong;
		switch(country) {
		case "Italy": case "France": case "Spain":
			continent = cont.Europe; break;
		case "Canada": case "Usa": case "Cuba":
			continent = cont.North_America; break;
		case "India": case "Japan": case "Thailand":
			continent = cont.Asia; break;
		case "Brazil": case "Colombia": case "Argentina":
			continent = cont.South_America; break;
		case "Egypt": case "Madagascar": case "Ethiopia":
			continent = cont.Africa; break;
		case "Australia": 
			continent = cont.Australia; break;

		}System.out.println(continent);
	}

}