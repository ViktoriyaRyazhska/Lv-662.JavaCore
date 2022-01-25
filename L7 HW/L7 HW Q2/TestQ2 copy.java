package l7HWQ2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQ2 {

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
	public void testPassengers() {
		Passengers p1 = new Passengers();
		p1.setPassengers(5);
		assertTrue(p1.getPassengers() == 5);
	}
	
	@Test 
	public void testLiner() {
		Liner l1 = new Liner();
		l1.setFloors(2);
		l1.setPassengers(4);
		assertTrue(l1.getFloors() == 2);
		assertTrue(l1.getPassengers() == 4);
	}
	
	@Test 
	public void testPlane() {
		Plane p1 = new Plane();
		p1.setMaxDistance(200);
		p1.setPassengers(4);
		assertTrue(p1.getMaxDistance() == 200);
		assertTrue(p1.getPassengers() == 4);
	}
	
	@Test
	public void testHelicopter() {
		Helicopter h1 = new Helicopter();
		h1.setPassengers(4);
		assertTrue(h1.getPassengers() == 4);
	}
	
	@Test
	public void testBoat() {
		Boat b1 = new Boat();
		b1.setPassengers(200);
		b1.setVolume(400);
		assertTrue(b1.getPassengers() == 200);
		assertTrue(b1.getVolume() == 400);
	}
	
	@Test
	public void testBus() {
		Bus b2 = new Bus();
		b2.setPassengers(5);
		b2.setRoute("North");
		assertTrue(b2.getPassengers() == 5);
		assertTrue(b2.getRoute() == "North");
	}
	
	@Test
	public void testMotorcycle() {
		Motorcycle m1 = new Motorcycle();
		m1.setMaxSpeed(50);
		m1.setPassengers(1);
		assertTrue(m1.getMaxSpeed() == 50);
		assertTrue(m1.getPassengers() == 1);
	}
	
	@Test
	public void testCar() {
		Car c1 = new Car();
		c1.setModel("Toyota");
		c1.setPassengers(4);
		assertTrue(c1.getModel() == "Toyota");
		assertTrue(c1.getPassengers() == 4);
	}

}
