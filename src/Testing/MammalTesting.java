package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Mammal;

public class MammalTesting {

	// constructor test

	@Test

	public void testMammalConstructor() {
		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 1.2, 2, 0, 0);
		assertNotNull(testMammal);
	}

	// test getters and setters

	@Test

	public void testGetSpeed() {

		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 1.2, 2, 0, 0);

		assertEquals(testMammal.getSpeed(), 0);

	}

	@Test

	public void testSetSpeed() {

		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 1.2, 2, 0, 0);

		testMammal.setSpeed(12);

		assertEquals(testMammal.getSpeed(), 12);

	}

	@Test
	public void testGetSprintFactor() {

		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 1.2, 2, 0, 0);

		assertEquals(testMammal.getSprintFactor(), 0);

	}

	@Test

	public void testSetSprintFactor() {

		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 1.2, 2, 0, 0);

		testMammal.setSprintFactor(12);

		assertEquals(testMammal.getSprintFactor(), 12);

	}

	/// Testing Mammal Methods

	@Test

	// test to check sprint

	public void testSprint() {
		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 2, 2, 0, 0);
		testMammal.setSpeed(100);
		testMammal.setSprintFactor(1);
		testMammal.getSpeed();
		assertEquals(100, testMammal.getSpeed());
	}

	// test to check growth

	@Test

	public void testGrowth() {
		Mammal testMammal = new Mammal("Mama", 10, "mammal", "male", "small", 10, 20, 5, 2, 2, 2, 0, 0);
		testMammal.growth();
		testMammal.setHeight(20);
		assertEquals(20, testMammal.getHeight());
	}
}
