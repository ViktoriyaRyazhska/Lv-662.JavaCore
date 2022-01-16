package java12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num {
	public static void main(String[]agrs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("insert the numbers");
		int a = Integer.parseInt(br.readLine());
		
		int b = Integer.parseInt(br.readLine());
		
		int c = Integer.parseInt(br.readLine());
		
		if ((a%2)==0 & (b%2)==0 & (c%2)==0){
		System.out.println("three odd");}
		
	    if ((a%2)==0 & b%2==0 & (c%2)!=0){
	    	System.out.println("two odd");}
		
	    if ((a%2)==0 & b%2!=0 & (c%2)==0){
		System.out.println("two odd");}
	    
	    if ((a%2)!=0 & b%2==0 & (c%2)==0){
	    	System.out.println("two odd");}
	    
	    if ((a%2)!=0 & b%2!=0 & (c%2)==0){
	    	System.out.println("one odd");}
	    if ((a%2)!=0 & b%2==0 & (c%2)!=0){
	    	System.out.println("one odd");}
	    if ((a%2)==0 & b%2!=0 & (c%2)!=0){
	    	System.out.println("one odd");}
	    else{System.out.println("No one odd");}
	    
	}

	}
	