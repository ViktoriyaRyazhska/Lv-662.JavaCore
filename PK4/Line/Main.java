package java19;

public class Main {
public static void main(String[] args) {
	
		
	
		Line[] lines = new Line[3];
		lines[0] = new Line(new Point(1,7),new Point(4,5));
		lines[1] = new ColorLine(new Point(2,5), new Point(1,4), "фиолетовый");
		lines[2] = new Line(new Point(5,3), new Point(6,9));
		
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
			if (lines[i] instanceof ColorLine) {
				((ColorLine)lines[i]).color();
			}
		}
	}
}
