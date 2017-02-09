package hello;

public class Bird extends Animal {

	private int speed;
	private int sprintFactor;
	private boolean canFly;

	public Bird(String name, int age, String species, String gender, String size, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);

	}

	@Override
	public String movement() {
		if (canFly == true) {
			return "Bird needs an open enclosure";
		} else {
			return "Bird doesnt necessarily need an open enclosure";
		}
	}

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

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
}
