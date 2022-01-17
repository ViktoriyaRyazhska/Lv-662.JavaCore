package l7P2;

public class ColorLine extends Line {
	
	String color;

	public ColorLine(Point x, Point y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorLine [x=" + x + ", y=" + y + "]";
	}

	public void color() {
		System.out.println("The color of this shape is " + color);
	}
	

}
