package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Pigeon;

public class PigeonTesting {

	// testing Pigeon constructor

	@Test

	public void testPigeonConstructor() {
		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);
		assertNotNull(testP);
	}
	// testing G and C

	@Test

	public void testIsEndangered() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		assertEquals(testP.isEndangered(), false);

	}

	@Test

	public void testSetEndangered() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		testP.setEndangered(true);

		assertEquals(testP.isEndangered(), true);

	}

	@Test

	public void testGetLandingSpeed() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		assertEquals(testP.getLandingSpeed(), 0);

	}

	@Test

	public void testLandingSpeed() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		testP.setLandingSpeed(20);

		assertEquals(testP.getLandingSpeed(), 20);

	}

	@Test

	public void testGetTakeOffSpeed() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		assertEquals(testP.getTakeOffSpeed(), 0);

	}

	@Test

	public void testSetTakeOffSpeed() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		testP.setTakeOffSpeed(20);

		assertEquals(testP.getTakeOffSpeed(), 20);

	}

	@Test

	public void testGetPower() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		assertEquals(testP.getPower(), 0);

	}

	@Test

	public void testSetPower() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		testP.setTakeOffSpeed(20);

		assertEquals(testP.getPower(), 20);

	}

	@Test

	public void testGetOptimalFlightTime() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		assertEquals(testP.getOptimalFlightTime(), 0);

	}

	@Test

	public void testSetOptimalFlightTime() {

		Pigeon testP = new Pigeon("Joe", "male", "small", "pigeon", 2, 0, 0, 0, 0, 0, 0, false);

		testP.setOptimalFlightTime(20);

		assertEquals(testP.getOptimalFlightTime(), 20);

	}

}
