package hello;

public class Pigeon extends Bird implements Flying {

	boolean endangered;

	public Pigeon(String name, String species, String gender, String size, int age, int height, int weight, int waste, int foodmass, double growthFactor,
			boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor);
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

	

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
