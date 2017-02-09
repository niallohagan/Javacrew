package hello;

public class Fish extends Animal implements Swim {

	public Fish(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	@Override
	public String movement() {
		System.out.println("fish moves");
		return null;
	}

	@Override
	public void respiration() {
		System.out.println("fish respires");
		
	}

	@Override
	public String growth() {
		System.out.println("fish grows");
		return null;
	}

	@Override
	public void canSwim() {
		System.out.println("fish swims");
	}

	@Override
	public void breathesUnderwater() {
		System.out.println("fish breathes underwater");
	}
}
