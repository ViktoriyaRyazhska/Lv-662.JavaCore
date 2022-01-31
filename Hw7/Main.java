package hw;

public class Main {

	public static void main(String[] args) {
		
		Person s1 = new Student("Влад", "Яковец", 21, 4);
		Person s2 = new Student("Дима", "Пугач", 21, 4);
		Person s3 = new Student("Иван", "Иванов", 19, 2);
		System.out.println(s1.info() + ". " + s1.activity());
		System.out.println(s2.info() + ". " + s2.activity());
		System.out.println(s3.info() + ". " + s3.activity());
	}
}