package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinentApp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter country name:");
		String country = br.readLine();
		
		Continent continent = Continent.EUROPE;
		
		switch (country) {
		case "Ukraine": case "France": case "Germany":
			System.out.printf("Continent for this country is ");
			continent = Continent.EUROPE; break;
		case "USA": case "Canada": case "Mexico":
			System.out.printf("Continent for this country is ");
			continent = Continent.NORTH_AMERICA; break;
		case "China": case "Indonesia": case "Sri Lanka":
			System.out.printf("Continent for this country is ");
			continent = Continent.ASIA; break;
		case "Argentina": case "Chile": case "Brasilia":
			System.out.printf("Continent for this country is ");
			continent = Continent.SOUTH_AMERICA; break;
		case "Egypt": case "Tunisia": case "Marocco":
			System.out.printf("Continent for this country is ");
			continent = Continent.AFRICA; break;
		case "Australia": case "New Zealand":
			System.out.printf("Continent for this country is ");
			continent = Continent.AUSTRALIA; break;	
		default:
			System.out.println("No such country in database");
			System.exit(0);
		}
		System.out.println(continent);

	}
}
