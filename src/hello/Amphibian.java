package hello;

public class Amphibian extends Animal implements Swim {

	public Amphibian(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	@Override
	public void nutrition() {
		System.out.println("amphibian eats");
	}

	
	@Override
	public void growth() {
		System.out.println("amphibian grows");
	}

	@Override
	public void canSwim() {
		System.out.println("amphibian can swim");
		
	}

	@Override
	public void breathesUnderwater() {
		
		System.out.println("amphibian can breathe underwater");
	}
}
