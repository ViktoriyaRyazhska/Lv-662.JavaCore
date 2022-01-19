package l5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

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
	void testGetModel() {
		Car model = new Car("Fiat", 1988, 2.0);
		assertEquals("Fiat", model.getModel());
	}

	@Test
	void testGetYear() {
		Car year = new Car("Fiat", 1988, 2.0);
		assertEquals(1988, year.getYear());
	}

	@Test
	void testGetEngineCapacity() {
		Car engineCapacity = new Car("Fiat", 1988, 2.0);
		assertEquals(2.0, engineCapacity.getEngineCapacity());
	}

}
