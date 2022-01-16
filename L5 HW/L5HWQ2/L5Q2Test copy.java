package l5HWQ2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class L5Q2Test {

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
		int[] ex_arr1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		assertTrue(Calc.calcResult(ex_arr1) == 5);
	}

	@Test
	public void testCalc2() {
		int[] ex_arr2 = { 1, 1, -1, 1, 1, 1, 1, 1, 1, 1 };
		assertTrue(Calc.calcResult(ex_arr2) == 1);
	}

	@Test
	public void testCalc3() {
		int[] ex_arr3 = { 1, 1, 1, 1, 1, 1, 1, -1, 1, 1 };
		assertTrue(Calc.calcResult(ex_arr3) == 5);
	}

	@Test
	public void testCalc4() {
		int[] ex_arr4 = { 1, 1, 1, 1, -1, 1, 1, 1, 1, 1 };
		assertTrue(Calc.calcResult(ex_arr4) == 1);
	}

	@Test
	public void testCalc5() {
		int[] ex_arr5 = { 1, 1, 1, 1, 1, -1, 1, 1, 1, 1 };
		assertTrue(Calc.calcResult(ex_arr5) == 5);
	}
}
