package l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter contry name");
		String contry = br.readLine();
		
		enum Continent {
			ASIA, AFRICA, EUROPE, AUSTRALIA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA
		}
		
		Continent continent = null;
		
		switch (contry) {
		case "Bahrain": case "China": case "India":
		continent = Continent.ASIA; break;
		case "Algeria": case "Chad": case "Somalia":
		continent = Continent.AFRICA; break;
		case "Ukraine": case "Italy": case "Germany":
		continent = Continent.EUROPE; break;
		case "Australia":
		continent = Continent.AUSTRALIA; break;
		case "USA": case "Mexico": case "Canada":
	    continent = Continent.NORTH_AMERICA; break;
		case "Brasil": case "Columbia": case "Argentina":
		continent = Continent.SOUTH_AMERICA; break;
		case "Antarctica":
		continent = Continent.ANTARCTICA;
		default:
		System.out.println("No this country!");
		System.exit(0);
		
		}
		
		System.out.println(continent);

	}

}
