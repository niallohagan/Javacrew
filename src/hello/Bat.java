package hello;

public class Bat extends Mammal implements Flying {

	private boolean nocturnal;
	private boolean endangered;

	public Bat(String name, String species, String gender, String size, int age, int height, int weight, int waste, int foodmass, double growthFactor,
			boolean nocturnal, boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, foodmass);
		this.nocturnal = nocturnal;
		this.endangered = endangered;
	}

	

	@Override
	public void flight() {
		System.out.println("Bat flys");
	}

	@Override
	public void landing() {
		System.out.println("Bat lands");
	}

	@Override
	public void takeOff() {
		System.out.println("Bat takes off");
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
