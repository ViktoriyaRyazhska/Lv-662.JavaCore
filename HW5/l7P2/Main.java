package l7P2;

public class Main {

	public static void main(String[] args) {
	
		Line[] lines = new Line[5];
		lines[0] = new Line(2, 4);
		lines[1] = new Line(3, 5);
		lines[2] = new ColorLine(8, 12);
		lines[3] = new Line(4, 9);
		lines[4] = new ColorLine(5, 10);
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}
	}
}
