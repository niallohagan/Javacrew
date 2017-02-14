package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Bat;

public class BatTesting {

	// testing bat constructor

	@Test

	public void testBatConstructor() {
		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
		assertNotNull(Vampy);
	}

	// testing G and S

	@Test

	public void testIsNocturnal() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(Vampy.isNocturnal(), false);

	}

	@Test

	public void testSetNocturnal() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		Vampy.setNocturnal(true);

		assertEquals(Vampy.isNocturnal(), true);

	}

	@Test

	public void testIsEndangered() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(Vampy.isEndangered(), false);

	}

	@Test

	public void testSetEndangered() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		Vampy.setEndangered(true);

		assertEquals(Vampy.isEndangered(), true);

	}

	@Test

	public void testIsCanFly() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(Vampy.isCanFly(), false);

	}

	@Test

	public void testSetCanFly() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		Vampy.setCanFly(true);

		assertEquals(Vampy.isCanFly(), true);

	}

	@Test

	public void testGetTakeOffSpeed() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(Vampy.getTakeOffSpeed(), 0);

	}

	@Test

	public void testSetTakeOffSpeed() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		Vampy.setTakeOffSpeed(20);

		assertEquals(Vampy.getTakeOffSpeed(), 20);

	}

	@Test

	public void testGetPower() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(Vampy.getPower(), 0);

	}

	@Test

	public void testSetPower() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		Vampy.setTakeOffSpeed(20);

		assertEquals(Vampy.getPower(), 20);

	}

	@Test

	public void testGetOptimalFlightTime() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(Vampy.getOptimalFlightTime(), 0);

	}

	@Test

	public void testSetOptimalFlightTime() {

		Bat Vampy = new Bat("Drak", "Bat", "female", "small", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		Vampy.setOptimalFlightTime(20);

		assertEquals(Vampy.getOptimalFlightTime(), 20);

	}

}
