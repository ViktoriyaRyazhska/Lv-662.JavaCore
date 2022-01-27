package hw8.homework_1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<Integer> iSet1 = new HashSet<>();
		Set<Integer> iSet2 = new HashSet<>();
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			iSet1.add(rand.nextInt(25));
			iSet2.add(rand.nextInt(25));
		}
		
		System.out.println("Set1: " + iSet1);
		System.out.println("Set2: " + iSet2);
		System.out.println("Union: " + union(iSet1, iSet2));
		System.out.println("Intersection: " + intersect(iSet1, iSet2));
		
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> union = new HashSet<>(set1);
		union.addAll(set2);
		return union;
	}
	
	public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
		Set<E> intersect = new HashSet<>();
		
		for (E e : set1) {
			
			if (!set2.add(e)) {
				intersect.add(e);
			}
			
		}
		return intersect;
	}

}
