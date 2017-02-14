package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Fish;

public class FishTesting {

	// testing fish constructor

	@Test

	public void testFishConstructor() {
		Fish testF = new Fish("Wanda", 0, "fish", "female", "small", 0, 0, 0, 0, 0, 0);
		assertNotNull(testF);
	}

	@Test

	public void testIsAbilityToSwim() {

		Fish testF = new Fish("Wanda", 0, "fish", "female", "small", 0, 0, 0, 0, 0, 0);

		assertEquals(testF.isAbilityToSwim(), false);

	}

	@Test

	public void testSetAbilityToSwim() {

		Fish testF = new Fish("Wanda", 0, "fish", "female", "small", 0, 0, 0, 0, 0, 0);

		testF.setAbilityToSwim(true);

		assertEquals(testF.isAbilityToSwim(), true);

	}

	// testing methods

	@Test

	// test to check Growth

	public void testGrowth() {
		Fish testF = new Fish("Wanda", 0, "fish", "female", "small", 0, 0, 0, 0, 0, 0);
		testF.growth();
		testF.setHeight(20);
		assertEquals(20, testF.getHeight());
	}

	@Test

	// test to check canSwim

	public void testCanSwim() {
		Fish testF = new Fish("Wanda", 0, "fish", "female", "small", 0, 0, 0, 0, 0, 0);
		testF.canSwim();
		testF.isAbilityToSwim();
		assertEquals(true, testF.isAbilityToSwim());
	}
}
