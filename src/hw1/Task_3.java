package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("This program wll calculate call cost from USA, Poland and Italy to Ukraine. \n");
		System.out.println("Calls from the USA to Ukraine cost per minute (UAH per minute)?");
		int c1 = Integer.parseInt(br.readLine());
		System.out.println("How many minutes will call contiuned from USA to Ukraine");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("Calls from the Poland to Ukraine cost per minute (UAH per minute)?");
		int c2 = Integer.parseInt(br.readLine());
		System.out.println("How many minutes will call contiuned from Poland to Ukraine");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("Calls from the Italy to Ukraine cost per minute (UAH per minute)?");
		int c3 = Integer.parseInt(br.readLine());
		System.out.println("How many minutes will call contiuned from Italy to Ukraine");
		int t3 = Integer.parseInt(br.readLine());

		System.out.printf("\nCall from USA to Ukraine for " + t1 + " minutes " + "will cost: ");
		System.out.println(c1 * t1 + " UAH");
		System.out.printf("Call from Poland to Ukraine for " + t1 + " minutes " + "will cost: ");
		System.out.println(c2 * t2 + " UAH");
		System.out.printf("Call from Italy to Ukraine for " + t1 + " minutes " + "will cost: ");
		System.out.println(c3 * t3 + " UAH");
	}
}