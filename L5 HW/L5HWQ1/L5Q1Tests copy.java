package l5HW;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class L5Q1Tests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalc1() {
		assertTrue(Calc.giveDays(3) == 31);
	}
	
	@Test
	public void testCalc2() {
		assertTrue(Calc.giveDays(0) == 0);
	}
	
	@Test
	public void testCalc3() {
		assertTrue(Calc.giveDays(12) == 31);
	}
	
	@Test
	public void testCalc4() {
		assertTrue(Calc.giveDays(13) == 0);
	}
	
	


}
