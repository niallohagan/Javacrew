package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Reptile;

public class ReptileTesting {

	// test reptile constructor

	@Test

	public void testReptileConstructor() {
		Reptile testRep = new Reptile("Reppy", 10, "Reptile", "male", "large", 0, 0, 0, 0, 0, 0);
		assertNotNull(testRep);
	}
	// testing G and S
	// there are none

	// testing methods
	@Test

	// test to check Growth

	public void testGrowth() {
		Reptile testRep = new Reptile("Reppy", 10, "Reptile", "male", "large", 0, 0, 0, 0, 0, 0);
		testRep.growth();
		testRep.setHeight(20);
		assertEquals(20, testRep.getHeight());
	}
}
