package hw5.practice_2;

public class App {
	
	public static void main(String[] args) {
		
		Line[] lines = new Line[2];
		
		lines[0] = new Line(new Point(3, 5), new Point(9, 13));
		lines[1] = new ColorLine(new Point(4, 7), new Point(22, 59), "Red");
		
		for (Line line : lines) {
			line.print();			
		}
		
	}

}
