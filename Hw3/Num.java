package java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num {
	public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a,b and c");
        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        float c = Float.parseFloat(br.readLine());
        
        if(a<=5 && a>=-5) {
        	System.out.println("a belong to [-5;5]");
        }
        else {
        	System.out.println("a don`t belong to [-5;5]");
        }
        if(b<=5 && b>=-5) {
        	System.out.println("b belong to [-5;5]");
        }
        else {
        	System.out.println("b don`t belong to [-5;5]");
        }
        if(c<=5 && c>=-5) {
        	System.out.println("c belong to [-5;5]");
        }
        else {
        	System.out.println("c don`t belong to [-5;5]");
        }
        System.out.println("Enter x,y and z");
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        int z=Integer.parseInt(br.readLine());
        if(x>y&&x>z) {
        	System.out.println("Max x");
        }
        else if(y>x&&y>z) {
        	System.out.println("Max y");
        }
        else {
        	System.out.println("Max z");
        }
        if(x<y&&x<z) {
        	System.out.println("Min x");
        }
        else if(y<x&&y<z) {
        	System.out.println("Min y");
        }
        else {
        	System.out.println("Min z");
        }
}
}
