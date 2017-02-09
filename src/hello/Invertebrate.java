package hello;

public class Invertebrate extends Animal {

	public Invertebrate(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	@Override
	public void nutrition() {
		System.out.println("invert eats");
	}

	@Override
	public void movement() {
		System.out.println("invert moves");
	}

	@Override
	public void growth() {
		System.out.println("fish grows");
	}
}
