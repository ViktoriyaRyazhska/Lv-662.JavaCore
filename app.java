package l3;

import java.io.IOException;

public class app {

	public static void main(String[] args) throws IOException {
		Person Kat = new Person();
		Kat.setfirstName("Kat");
		Kat.input();
		System.out.print(Kat);
		System.out.print(Kat.getAge());
	}
}
