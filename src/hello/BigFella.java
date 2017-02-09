package hello;

public class BigFella {

	public static void main(String[] args) {

		Animal animal1 = new Animal("Boris", 90, "mammal", "male", "large", 70, 90, 4.0);

		animal1.growth();
		animal1.movement();
		animal1.nutrition();
		animal1.reproduction();

		Reptile rep = new Reptile(null, 0, "reptile", null, null, 30, 30, 0);
		rep.reproduction();
		rep.growth();

		Snake snake1 = new Snake(null, null, "reptile", null, 0, 12, 0, 0, false, false, false, false);
		snake1.growth();
		
		Penguin pingu = new Penguin("Pingu", "bird", "male", "large",10, 20, 30, 0, false);
		pingu.breathesUnderwater();
		
	}

}
