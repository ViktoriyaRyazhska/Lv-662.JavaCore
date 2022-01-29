package l9HWQ1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestQ1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testUnion() {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		Set<String> ans = new HashSet<String>();
		
		s1.addAll(Stream.of("Hello", "Hi", "Hey").collect(Collectors.toSet()));
		s2.addAll(Stream.of("Goodbye", "Bye", "see you", "Hello").collect(Collectors.toSet()));
		ans.addAll(Stream.of("Hello", "Hi", "Hey", "Goodbye", "Bye", "see you").collect(Collectors.toSet()));
		System.out.println("Ans: " + ans);
		
		assertEquals(unions.union(s1, s2), ans);	
		}
	
	@Test
	void testIntersect() {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		Set<String> ans = new HashSet<String>();
		
		s1.addAll(Stream.of("Hello", "Hi", "Hey").collect(Collectors.toSet()));
		s2.addAll(Stream.of("Goodbye", "Bye", "see you", "Hello").collect(Collectors.toSet()));
		ans.addAll(Stream.of("Hello").collect(Collectors.toSet()));
		System.out.println("Ans: " + ans);
		
		assertEquals(Intersection.intersect(s1, s2), ans);	
		}

}
