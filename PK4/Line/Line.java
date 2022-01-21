package java19;

public class Line {
	public Point x;
	public Point y;
	
	public Line(Point x, Point y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Линия " + x + "," + y;
	}

}
