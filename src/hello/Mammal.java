package hello;

public class Mammal extends Animal implements Run {

	private int speed;
	private int sprintFactor;

	public Mammal(String name, int age, String species, String gender, String size, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate, int speed, int sprintFactor) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);

	}

	@Override
	public String growth() {
		if (height <= 40) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	@Override
	public int sprint() {
		speed = speed * sprintFactor;

		return speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSprintFactor() {
		return sprintFactor;
	}

	public void setSprintFactor(int sprintFactor) {
		this.sprintFactor = sprintFactor;
	}

}
