package l9HWQ1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.addAll(Stream.of("Hello", "Hi", "Hey").collect(Collectors.toSet()));
		s2.addAll(Stream.of("Goodbye", "Bye", "see you", "Hello").collect(Collectors.toSet()));
		
		unions.union(s1, s2);
		Intersection.intersect(s1, s2);
	}

	

}
