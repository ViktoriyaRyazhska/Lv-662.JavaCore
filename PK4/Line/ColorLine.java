package java19;

public class ColorLine extends Line {
	
	String color;

	public ColorLine(Point x, Point y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Цветная линия " + x + "; " + y ;
	}

	public void color() {
		System.out.println("Цвет этой линии : " + color);
	}
	

}