package hello;

public class Bird extends Animal {

	public Bird(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	public String growth() {
		System.out.println("Bird grows");
		return null;
	}
}
