import java.util.HashSet;
import java.util.Set;

public class Union {
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(2);
		set1.add(8);
		set1.add(10);
		set1.add(14);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(5);
		set2.add(8);
		set2.add(14);
		
		Set<Integer> union = new HashSet<>();
		
		union.addAll(set1);
		union.addAll(set2);
		
		System.out.println("Union of two sets are numbers: " + union);
		
		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(set1);
		intersection.retainAll(set2);
		
		System.out.println("Intersection of two sets are numbers: " + intersection);
		
		
	}
}
