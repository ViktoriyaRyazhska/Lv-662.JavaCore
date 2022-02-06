package hw10.practice_2;

public class App {

	public static void main(String[] args) {

		try {
			Plant p1 = new Plant(10, "GreeN", "rosE");
			System.out.println(p1);
			Plant p2 = new Plant(15, "reed", "tULip");
			System.out.println(p2);
		} catch (ColorException | TypeException e) {
			System.out.println("Can't create plant: " + e.getMessage());;
		}
		
	}

}
