package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Crocodile;

public class CrocTesting {

	// testing crocodile constructor

	@Test

	public void testCorcodileConstructor() {
		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);
		assertNotNull(snappy);
	}
	// testing G and S

	@Test

	public void testIsEndangered() {

		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(snappy.isEndangered(), false);

	}

	@Test

	public void testSetEndangered() {

		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);

		snappy.setEndangered(true);

		assertEquals(snappy.isEndangered(), true);

	}

	@Test

	public void testIsDangerous() {

		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(snappy.isDangerous(), false);

	}

	@Test

	public void testSetDangerous() {

		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);

		snappy.setDangerous(true);

		assertEquals(snappy.isDangerous(), true);

	}

	@Test

	public void testIsAbilityToSwim() {

		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(snappy.getAbilityToSwim(), false);

	}

	@Test

	public void testSetAbilityToSwim() {

		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);

		snappy.setAbilityToSwim(true);

		assertEquals(snappy.getAbilityToSwim(), true);

	}

	// testing methods

	@Test

	// test to check Growth

	public void testGrowth() {
		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);
		snappy.growth();
		snappy.setHeight(20);
		assertEquals(20, snappy.getHeight());
	}

	@Test

	// test to check canSwim

	public void testCanSwim() {
		Crocodile snappy = new Crocodile("Crock", "crocodile", "male", "large", 12, 0, 0, 0, 0, 0, 0, false, false);
		snappy.canSwim();
		snappy.getAbilityToSwim();
		assertEquals(true, snappy.getAbilityToSwim());
	}
}
