package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Cat;

public class CatTesting {

	// testing constructor

	@Test

	public void testCatConstructor() {
		Cat testC = new Cat("Idiot", "Cat", "female", "size", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
		assertNotNull(testC);
	}
	// testing G and S

	@Test

	public void testIsNocturnal() {

		Cat testC = new Cat("Idiot", "Cat", "female", "size", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(testC.isNocturnal(), false);

	}

	@Test

	public void testSetNocturnal() {

		Cat testC = new Cat("Idiot", "Cat", "female", "size", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		testC.setNocturnal(true);

		assertEquals(testC.isNocturnal(), true);

	}

	@Test

	public void testIsEndangered() {

		Cat testC = new Cat("Idiot", "Cat", "female", "size", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		assertEquals(testC.isEndangered(), false);

	}

	@Test

	public void testSetEndangered() {

		Cat testC = new Cat("Idiot", "Cat", "female", "size", 2, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

		testC.setEndangered(true);

		assertEquals(testC.isEndangered(), true);

	}
}
