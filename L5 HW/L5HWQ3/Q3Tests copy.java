package l5HWQ3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Q3Tests {

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
	public void testgetPositionOfPos() {
		System.out.println("testgetPositionOfPos running: ");
		int[] testarr1 = {1, 2, 3, -1, 4};
		assertTrue(SearchArr.getPositionOfPos(testarr1) == 1);
	}
	
	@Test
	public void testgetPositionOfPos2() {
		System.out.println("testgetPositionOfPos2 running: ");
		int[] testarr2 = {-1, -5, -3, -1, -5};
		assertTrue(SearchArr.getPositionOfPos(testarr2) == -1);
	}
	
	@Test
	public void testgetPositionOfPos3() {
		System.out.println("testgetPositionOfPos3 running: ");
		int[] testarr3 = {-1, -1, 3, -1, -1};
		assertTrue(SearchArr.getPositionOfPos(testarr3) == -1);
	}
	
	@Test
	public void testgetPositionOfPos4() {
		System.out.println("testgetPositionOfPos4 running: ");
		int[] testarr4 = {-1, -1, 3, -1, 4};
		assertTrue(SearchArr.getPositionOfPos(testarr4) == 4);
	}

	@Test
	public void testminimum() {
		System.out.println("testminimum running: ");
		int[] testarr5 = {-1, -1, 3, -1, 4};
		int [] ans = {-1, 0};
		assertArrayEquals(SearchArr.minimum(testarr5), ans);
	}

	@Test
	public void testminimum2() {
		System.out.println("testminimum2 running: ");
		int[] testarr6 = {-1, -1, 3, -1, -7};
		int [] ans2 = {-7, 4};
		assertArrayEquals(SearchArr.minimum(testarr6), ans2);
	}

	@Test
	public void testminimum3() {
		System.out.println("testminimum3 running: ");
		int[] testarr7 = {1, 1, 1, 1, 1};
		int [] ans3 = {1, 0};
		assertArrayEquals(SearchArr.minimum(testarr7), ans3);
	}

	@Test
	public void testminimum4() {
		System.out.println("testminimum4 running: ");
		int[] testarr8 = {-1, -1, -3, -1, 4};
		int [] ans4 = {-3, 2};
		assertArrayEquals(SearchArr.minimum(testarr8), ans4);
	}

	@Test
	public void testgetProduct1() {
		System.out.println("testgetProduct running: ");
		int[] testarr9 = {-1, -1, -3, -1, 4};
		assertTrue(SearchArr.getProduct(testarr9) == 4);
	}

	@Test
	public void testgetProduct2() {
		System.out.println("testgetProduct2 running: ");
		int[] testarr10 = {-1, -1, -3, -1, 5};
		assertTrue(SearchArr.getProduct(testarr10) == 1);
	}

	@Test
	public void testgetProduct3() {
		System.out.println("testgetProduct3 running: ");
		int[] testarr11 = {-1, -1, 2, -1, 4};
		assertTrue(SearchArr.getProduct(testarr11) == 8);
	}

	@Test
	public void testorganize() {
		System.out.println("testorganize running: ");
		int[] testarr12 = {3, 2, -3, -1, 4};
		int [] ans5 = {2, 3, -3, -1, 4};
		assertArrayEquals(SearchArr.organize(testarr12), ans5);
	}

	@Test
	public void testorganize2() {
		System.out.println("testorganize2 running: ");
		int[] testarr13 = {3, 2, 5, 2, 1};
		int [] ans6 = {1, 2, 2, 3, 5};
		assertArrayEquals(SearchArr.organize(testarr13), ans6);
	}

	@Test
	public void testorganize3() {
		System.out.println("testorganize3 running: ");
		int[] testarr14 = {-3, 2, -3, -1, 4};
		int [] ans7 = {-3, 2, -3, -1, 4};
		assertArrayEquals(SearchArr.organize(testarr14), ans7);
	}

}
