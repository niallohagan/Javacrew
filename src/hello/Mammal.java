package hello;

public class Mammal extends Animal implements Run {

	public Mammal(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}

	@Override
	public void reproduction() {
		System.out.println("mammal reproduces");
	}

	@Override
	public void growth() {
		System.out.println("mamml grows");
	}

	@Override
	public void sprint() {
		System.out.println("mammal sprints");
	}

}
