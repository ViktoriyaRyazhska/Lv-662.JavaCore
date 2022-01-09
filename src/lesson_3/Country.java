package lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Country {
	
	public enum Continent {
		ASIA, AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the country name");
		String country=br.readLine();
		 
	
		Continent continent = Continent.EUROPE;
		
		switch (country) {
		case "Indonesia": case "Pakistan": case "Japan":
			continent = Continent.ASIA; break;
		case "Nigeria": case "Egypt": case "Tanzania":
			continent = Continent.AFRICA; break;
		case "Germany": case "United Kingdom": case "France":
			continent = Continent.EUROPE; break;
		case "Mexico": case "Canada": case "Cuba":
			continent = Continent.NORTH_AMERICA; break;
		case "Samoa": case "Papua New Guinea": case "Guam":
			continent = Continent.AUSTRALIA; break;
		case "Peru": case "Chile": case "Bolivia":
			continent = Continent.SOUTH_AMERICA; break;
		default:
			System.out.println("No this country");
			System.exit(0);
		}
		System.out.println(continent);
	

	}

}
