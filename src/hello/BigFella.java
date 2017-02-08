package hello;

public class BigFella {

	public static void main(String[] args) {

		Animal animal1 = new Animal(null, 90, "reptile", "male", null, 70, 90);
		
		animal1.growth();
		animal1.movement();
		animal1.nutrition();
		animal1.reproduction(); 

	}

}
