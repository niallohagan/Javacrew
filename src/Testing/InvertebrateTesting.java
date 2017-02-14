package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Invertebrate;

public class InvertebrateTesting {

	// constructor test

	@Test

	public void testInvertebrateConstructor() {
		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);
		assertNotNull(testInvert);
	}

	// testing G and C
	@Test

	public void testIsReproduceSexually() {

		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);

		assertEquals(testInvert.isReproduceSexually(), false);

	}

	@Test

	public void testSetReproduceSexually() {

		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);

		testInvert.setReproduceSexually(true);

		assertEquals(testInvert.isReproduceSexually(), true);

	}

	@Test

	public void testIsHasLegs() {

		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);

		assertEquals(testInvert.isHasLegs(), false);

	}

	@Test

	public void testSetHasLegs() {

		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);

		testInvert.setHasLegs(true);

		assertEquals(testInvert.isHasLegs(), true);

	}
	// testing methods

	@Test

	// test to check Growth

	public void testGrowth() {
		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);
		testInvert.growth();
		testInvert.setHeight(20);
		assertEquals(20, testInvert.getHeight());
	}

	@Test

	// test to check movement

	public void testMovement() {
		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);
		testInvert.movement();
		testInvert.getSpecies();
		assertEquals(true, testInvert.isHasLegs());
	}

	@Test

	// test to check reproduction

	public void testReproduction() {
		Invertebrate testInvert = new Invertebrate("Bob", 10, "invertebrate", "male", "small", 0, 0, 0, 0, 0, 0, false,
				false);
		testInvert.reproduction();
		testInvert.getSize();
		assertEquals(true, testInvert.isReproduceSexually());
	}

}
