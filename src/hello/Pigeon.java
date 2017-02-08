package hello;

public class Pigeon extends Bird implements Flying {

	boolean endangered;

	public Pigeon(String name, String species, String gender, String size, int age, int height, int weight, boolean endangered) {
		super(name, age, gender, size, species, height, weight);
		this.endangered = endangered;
	}

	@Override
	public void flight() {

	}

	@Override
	public void landing() {

	}

	@Override
	public void takeOff() {

	}

	@Override
	public void nutrition() {

	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
