package hello;

public class Invertebrate extends Animal {

	public Invertebrate(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	@Override
	public String nutrition() {
		System.out.println("invert eats");
		return null;
	}

	@Override
	public String movement() {
		System.out.println("invert moves");
		return null;
	}

	@Override
	public String growth() {
		System.out.println("invert grows");
		return null;
	}
}
