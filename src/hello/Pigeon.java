package hello;

public class Pigeon extends Bird implements Flying {

	boolean endangered;

	public Pigeon(String name, String species, String gender, String size, int age, int height, int weight, double waste,
			boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste);
		this.endangered = endangered;
	}

	@Override
	public void flight() {
		System.out.println("pigeon flys");
	}

	@Override
	public void landing() {
		System.out.println("pigeon lands");
	}

	@Override
	public void takeOff() {
		System.out.println("pigeon takes off");
	}

	@Override
	public void nutrition() {
		System.out.println("pigeon eats");
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
