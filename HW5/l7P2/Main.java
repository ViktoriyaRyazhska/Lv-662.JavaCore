package l7P2;

public class Main {

	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(4,8);
		
	
		Line[] lines = new Line[5];
		lines[0] = new Line(p1, p2);
		lines[1] = new Line(new Point(1,2),new Point(2,3));
		lines[2] = new ColorLine(new Point(3,7), new Point(4, 11), "yellow.");
		lines[3] = new Line(new Point(8,12), new Point(5, 15));
		lines[4] = new ColorLine(new Point(6,12), new Point(4, 16), "blue.");
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
			if (lines[i] instanceof ColorLine) {
				((ColorLine)lines[i]).color();
			}
		}
	}
}
