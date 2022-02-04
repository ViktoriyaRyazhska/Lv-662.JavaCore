package hw8;

import java.util.HashSet;
import java.util.Set;

public class Hw {
public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		for(int i=0;i<4;i++) {
			double random = Math.random() * 8;
			set1.add((int) random);
		}
		System.out.println(set1);
		
		Set<Integer> set2 = new HashSet<>();
		for(int i=0;i<4;i++) {
			double random = Math.random() * 8;
			set2.add((int) random);
		}
		System.out.println(set2);
		
		Set<Integer> union = new HashSet<>();
		
		union.addAll(set1);
		union.addAll(set2);
		
		System.out.println("Все числа: " + union);
		
		Set<Integer> intersect = new HashSet<>();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		
		System.out.println("Числа которые повторяются: " + intersect);
		
		
	}
}

