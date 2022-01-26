package pk2;

public class Main {
	public static void main(String[] args) {
		Wrapper<Square> s1 = new Wrapper<Square>(new Square());
		System.out.println("Площадь квадрата="+s1.getArea());
		
		Wrapper<Circle> s2 = new Wrapper<Circle>(new Circle());
		System.out.println("Площадь круга="+s2.getArea());
	}
}
