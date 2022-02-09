package Lecture13;

import java.util.Arrays;

public class Flower {
	private String variety;

	Flower(String variety) {
		this.variety = variety;
	}
	
	public static int compareByVariety(Flower a, Flower b) {
		return a.variety.compareTo(b.variety);
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Override
	public String toString() {
		return "flower variety " + variety + " ";
	}

	public static void main(String[] args) {

		Flower[] flowers = { new Flower("tulip"), new Flower("rose"), new Flower("lily"), new Flower("sunflower"),
				new Flower("iris") };

		Arrays.sort(flowers, Flower::compareByVariety);
		System.out.print("The sorted list is: ");
		System.out.println(Arrays.toString(flowers));

	}
}
