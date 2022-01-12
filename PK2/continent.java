package java7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class continent {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Name yhe country");
		String country = br.readLine();
		
		Continent1 continent = Continent1.Wrong;
		switch(country) {
		case "Italy": case "France": case "Spain":
			continent = Continent1.Europe; break;
		case "Canada": case "Usa": case "Cuba":
			continent = Continent1.North_America; break;
		case "India": case "Japan": case "Thailand":
			continent = Continent1.Asia; break;
		case "Brazil": case "Colombia": case "Argentina":
			continent = Continent1.South_America; break;
		case "Egypt": case "Madagascar": case "Ethiopia":
			continent = Continent1.Africa; break;
		case "Australia": 
			continent = Continent1.Australia; break;
			
		}System.out.println(continent);
	}
	
}
