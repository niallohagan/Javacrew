package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Amphibian;

public class AmphibianTesting {

	// testing Amphibian constructor

	@Test

	public void testAmphibianConstructor() {
		Amphibian Amp = new Amphibian("Ampy", 0, "Amphibian", "male", "large", 10, 0, 0, 0, 0, 0);
		assertNotNull(Amp);
	}
	
	// testing G and S
	
	@Test

	public void testIsAbilityToSwim() {

		Amphibian Amp = new Amphibian("Ampy", 0, "Amphibian", "male", "large", 10, 0, 0, 0, 0, 0);

		assertEquals(Amp.isAbilityToSwim(), true);

	}

	@Test

	public void testSetAbilityToSwim() {

		Amphibian Amp = new Amphibian("Ampy", 0, "Amphibian", "male", "large", 10, 0, 0, 0, 0, 0);

		Amp.setAbilityToSwim(true);

		assertEquals(Amp.isAbilityToSwim(), true);

	}

}
