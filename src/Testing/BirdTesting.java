package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Bird;

public class BirdTesting {

	// constructor testing

	@Test

	public void testBirdConstructor() {
		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);
		assertNotNull(BigBird);
	}

	// test G and C

	@Test

	public void testIsCanFly() {

		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);

		assertEquals(BigBird.isCanFly(), false);

	}

	@Test

	public void testSetCanFly() {

		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);

		BigBird.setCanFly(true);

		assertEquals(BigBird.isCanFly(), true);

	}

	@Test

	public void testGetSpeed() {

		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);

		assertEquals(BigBird.getSpeed(), 0);

	}

	@Test

	public void testSetSpeed() {

		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);

		BigBird.setSpeed(20);

		assertEquals(BigBird.getSpeed(), 20);

	}

	@Test

	public void testGetSprintFactor() {

		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);

		assertEquals(BigBird.getSprintFactor(), 0);

	}

	@Test

	public void testSetSprintFactor() {

		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);

		BigBird.setSprintFactor(20);

		assertEquals(BigBird.getSprintFactor(), 20);

	}

	// testing methods

	@Test

	// test to check movement

	public void testMovement() {
		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);
		BigBird.movement();
		BigBird.isCanFly();
		assertEquals(false, BigBird.isCanFly());
	}

	@Test

	// test to check sprint

	public void testSprint() {
		Bird BigBird = new Bird("Wings", 0, "bird", "female", "small", 3, 0, 0, 0, 0, 0);
		BigBird.setSpeed(100);
		BigBird.setSprintFactor(1);
		BigBird.getSpeed();
		assertEquals(100, BigBird.getSpeed());
	}

}
