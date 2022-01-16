package java16;

public class Main {
	
		public static void main (String[] args) {

					int[] numbers = {23, -8, 11,-2, 10};
					int index = 0;
					for (int  i = 0; i < numbers.length; i++) {
						if (numbers[i] > 0) {
							index ++;
						} 
						if (index == 2) {
							System.out.println("Второе положительное число "+ numbers[i] + " находитья на " + (i + 1)+" месте");
							break;
						}
					}
					int min = numbers[0];
					int min1 = 0;
					int y = 0;
					
					while (y < numbers.length) {
						if (numbers[y] < min) {
							min = numbers[y];
							min1 = y;
						}
						y++;
					}
					System.out.println("Минимальное число = " + min + " на " + (min1 + 1) + " месте");
					int product = 1;
					for (int w = 0; w < numbers.length; w++) {
						if (numbers[w] % 2 == 0) {
							product *= numbers[w];
						}
					}
					System.out.println("Результат умножения парных чисел =  " + product);
					

				}
			}


