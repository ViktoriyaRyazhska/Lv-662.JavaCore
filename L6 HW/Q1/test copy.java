package l6HWQ1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {

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
	
	Swallow swallow = new Swallow();
	Eagle eagle = new Eagle();
	Penguin penguin = new Penguin();
	Chicken chicken = new Chicken();

	@Test
	public void testFly() {
		assertTrue(eagle.fly() == true);
	}

	@Test
	public void testGetType() {
		assertEquals(swallow.getType(), "Swallow");
	}

	@Test
	public void testGetFeathers() {
		assertEquals(swallow.getFeathers(), "Blue");
	}

	@Test
	public void testGetEggs() {
		assertTrue(penguin.getEggs() == 1);
	}

	@Test
	public void testSetFeathers() {
		assertEquals(chicken.getFeathers(), "White");
	}
}
