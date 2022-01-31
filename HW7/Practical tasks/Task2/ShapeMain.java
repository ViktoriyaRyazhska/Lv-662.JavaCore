package Task2;

public class ShapeMain {

	public static void main(String[] args) {
		Wrapper<Square> s1 = new Wrapper<Square>(new Square());
		System.out.println(s1.getArea());
		
		Wrapper<Circle> s2 = new Wrapper<Circle>(new Circle());
		System.out.println(s2.getArea());
	}
	
}
