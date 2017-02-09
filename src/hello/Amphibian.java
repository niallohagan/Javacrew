package hello;

public class Amphibian extends Animal implements Swim {

	public Amphibian(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	@Override
	public String nutrition() {
		System.out.println("amphibian eats");
		return null;
	}

	
	@Override
	public String growth() {
		System.out.println("amphibian grows");
		return null;
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
