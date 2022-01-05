package hw3;
// Why use enum here?

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ContinentByCountryApp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/apple/Countries_by_Continent.csv"));
		HashMap<String, String> map = new HashMap<>();
		String line = br.readLine();
		
		while (line != null) {
			String[] input = line.split(",");
			map.put(input[0],input[1]);
			line = br.readLine();
		}
		br.close();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the name of the country: ");
		String country = br1.readLine();
		if (map.containsKey(country)) {
			System.out.println("This country is in " + map.get(country));
		} else {
			System.out.println("This country is in the middle of nowhere");	
		}
		br1.close();
	}

}
