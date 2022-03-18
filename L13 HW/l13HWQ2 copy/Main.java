package l13HWQ2;

public class Main {

	public static void main(String[] args) {
		System.out.println("encrypt input: abcxyz; 2");
		System.out.println("Result: " + Methods.encrypt("abcxyz",2));
		System.out.println("encrypt input: abcxyz; 4");
		System.out.println("Result: " + Methods.encrypt("abcxyz",4));
		System.out.println("encrypt input: abcxyz; 3");
		System.out.println("Result: " + Methods.encrypt("abcxyz",3));


		System.out.println("decrypt input: abcxyz; 2");
		System.out.println("Result: " + Methods.decrypt("abcxyz",2));
		System.out.println("decrypt input: abcxyz; 4");
		System.out.println("Result: " + Methods.decrypt("abcxyz",4));
		System.out.println("decrypt input: abcxyz; 3");
		System.out.println("Result: " + Methods.decrypt("abcxyz",3));

	}

}
