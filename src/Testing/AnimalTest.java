package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Snake;

public class AnimalTest {

	// constructor test

	@Test
	public void testAnimalConstructor() {
		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);
		assertNotNull(testSnake);
	}

	// Get & Set Tests

	@Test

	public void testGetAnimalName() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getName(), "Hissy");

	}

	@Test

	public void testSetAnimalName() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setName("Slider");

		assertEquals(testSnake.getName(), "Slider");

	}

	@Test

	public void testGetAnimalSpecies() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getSpecies(), "Viper");

	}

	@Test

	public void testSetAnimalSpecies() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setSpecies("Python");

		assertEquals(testSnake.getSpecies(), "Python");

	}

	@Test

	public void testGetAnimalGender() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getGender(), "male");

	}

	@Test

	public void testSetAnimalGender() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setGender("Female");

		assertEquals(testSnake.getGender(), "Female");

	}

	@Test

	public void testGetAnimalSize() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getSize(), "Large");

	}

	@Test

	public void testSetAnimalSize() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setSize("Small");

		assertEquals(testSnake.getSize(), "Small");

	}

	@Test

	public void testGetAnimalAge() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getAge(), 3);

	}

	@Test

	public void testSetAnimalAge() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setAge(12);

		assertEquals(testSnake.getAge(), 12);

	}

	@Test

	public void testGetAnimalHeight() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getHeight(), 20);

	}

	@Test

	public void testSetAnimalHeight() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setHeight(10);

		assertEquals(testSnake.getHeight(), 10);

	}

	@Test

	public void testGetAnimalWeight() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.getWeight(), 150);

	}

	@Test

	public void testSetAnimalWeight() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setWeight(275);

		assertEquals(testSnake.getWeight(), 275);

	}

	@Test

	public void testGetAnimalPoisonous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.isPoisonous(), true);
	}

	@Test

	public void testSetPoisonous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setPoisonous(false);

		assertEquals(testSnake.isPoisonous(), false);

	}

	@Test

	public void testGetEndangered() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.isEndangered(), false);
	}

	@Test

	public void testSetEndangered() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setEndangered(true);

		assertEquals(testSnake.isEndangered(), true);

	}

	@Test

	public void testGetVenomous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.isVenomous(), true);
	}

	@Test

	public void testSetVenomous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setVenomous(false);

		assertEquals(testSnake.isVenomous(), false);

	}

	@Test

	public void testGetDangerous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		assertEquals(testSnake.isDangerous(), true);
	}

	@Test

	public void testSetDangerous() {

		Snake testSnake = new Snake("Hissy", "Viper", "male", "Large", 3, 20, 150, true, false, true, true);

		testSnake.setDangerous(false);

		assertEquals(testSnake.isDangerous(), false);

	}
}
