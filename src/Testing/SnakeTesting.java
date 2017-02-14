package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Snake;

public class SnakeTesting {

	// constructor testing

	@Test

	public void testSnakeConstructor() {
		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);
		assertNotNull(testSnake);
	}

	// testing G and S
	@Test

	public void testIsPoisonous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		assertEquals(testSnake.isPoisonous(), false);

	}

	@Test

	public void testSetPoisonous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		testSnake.setPoisonous(true);

		assertEquals(testSnake.isPoisonous(), true);

	}

	@Test

	public void testIsVenomous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		assertEquals(testSnake.isVenomous(), false);

	}

	@Test

	public void testSetVenomous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		testSnake.setVenomous(true);

		assertEquals(testSnake.isVenomous(), true);

	}

	@Test

	public void testIsEndangered() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		assertEquals(testSnake.isEndangered(), false);

	}

	@Test

	public void testSetEndangered() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		testSnake.setEndangered(true);

		assertEquals(testSnake.isEndangered(), true);

	}

	@Test

	public void testIsDangerous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		assertEquals(testSnake.isDangerous(), false);

	}

	@Test

	public void testSetDangerous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, 0, 0, 0, 0, true, false, true, true);

		testSnake.setDangerous(true);

		assertEquals(testSnake.isDangerous(), true);

	}

}
