package java7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 чисел:");
int[] x=new int[10];
for(int i=0;i<x.length;i++) {
	x[i]=Integer.parseInt(br.readLine());
}		int sum = 0;
		int dob = 1;
		int res1 = 0;
		int res2 = 0;
		for (int i = 0; i <x.length-5;i++)
			if(x[i]<0) {
				dob= x[5]*x[6]*x[7]*x[8]*x[9];	
				res1+=dob;
			}else {
				sum=x[0]+x[1]+x[2]+x[3]+x[4];
				res2=sum;
			}
		if(res1==0)
		{System.out.println("Сумма первых пяти елементов="+res2);}
		else {
			System.out.println("Произведение последних пяти елементов="+res1);
		}

	}

}