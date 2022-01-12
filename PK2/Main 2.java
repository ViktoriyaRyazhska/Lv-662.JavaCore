import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]agrs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Введіть номер дня неділі");
		int a = Integer.parseInt(br.readLine());
		switch(a) {
		case 1:
			System.out.println("Monday,Понеділок");
			break;
		case 2:
			System.out.println("Tuesday,Вівторок");
			break;
		case 3:
			System.out.println("Wednesday,Середа");
			break;
		case 4:
			System.out.println("Thursday,Четвер");
			break;
		case 5:
			System.out.println("Friday,П'ятніця");
			break;
		case 6:
			System.out.println("Saturday,Субота");
			break;
		case 7:
			System.out.println("Sunday,Неділя");
			break;
			default:
				System.out.println("Немає відповіді");
			
		}
		
	
	} 
	}