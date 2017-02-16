package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Penguin;

public class PenguinTesting {

	// test constructor

	@Test

	public void testPenguinConstructor() {
		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);
		assertNotNull(Puffy);
	}

	// test G and S
	@Test

	public void testIsEndangered() {

		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);

		assertEquals(Puffy.isEndangered(), false);

	}

	@Test

	public void testSetEndangered() {

		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);

		Puffy.setEndangered(true);

		assertEquals(Puffy.isEndangered(), true);

	}

	@Test

	public void testIsAbilityToSwim() {

		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);

		assertEquals(Puffy.isAbilityToSwim(), false);

	}

	@Test

	public void testSetAbilityToSwim() {

		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);

		Puffy.setAbilityToSwim(true);

		assertEquals(Puffy.isAbilityToSwim(), true);

	}

	// testing methods

	@Test

	// test to check Growth

	public void testGrowth() {
		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);
		Puffy.growth();
		Puffy.setHeight(20);
		assertEquals(20, Puffy.getHeight());
	}

	@Test

	// test to check canSwim

	public void testCanSwim() {
		Penguin Puffy = new Penguin("Puffy", "penguin", "male", "large", 10, 0, 0, 0, 0, 0, 0, false);
		Puffy.canSwim();
		Puffy.isAbilityToSwim();
		assertEquals(false, Puffy.isAbilityToSwim());
	}
}
