package java11;

public class Main {
	public static void main(String[] args) {
		int [] x = {7,3,-4,2,-6,22,-9,1,0,5,10};
		int max = x[0];
		int sum = 0;
		int sumres=0;
		int neg=0;
		for (int i = 0; i < x.length; i++)   
		max= Math.max(max,x[i]);
		System.out.println("Максимальное число в массиве : "+max);
		for (int i = 0; i < x.length; i++)  
		if(x[i]>0) {
			sum+=x[i];
			}
		sumres=sum;
		System.out.println("Сумма положительных чисел в массиве : "+sumres);
		for (int i = 0; i < x.length; i++)  
			if(x[i]<0) {
				neg++;
				}
		System.out.println("Колличество отрицательных чисел в массиве : "+neg);
	}
}