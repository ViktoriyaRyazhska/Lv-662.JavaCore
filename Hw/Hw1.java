package intra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Hello, how are you?");
		String e = br.readLine();
		System.out.println("You are " +e);
		System.out.println("c=");
		int c = Integer.parseInt(br.readLine());
		System.out.println("c=");
		int d = Integer.parseInt(br.readLine());
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		}}

