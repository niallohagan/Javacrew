package hello;

public class Crocodile extends Reptile implements Swim {

	boolean endangered;
	boolean dangerous;

	public Crocodile(String name, String species, String gender, String size, int age, int height, int weight, int waste, int foodmass, double growthFactor,
			boolean dangerous, boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor);
		this.endangered = endangered;
		this.dangerous = dangerous;
	}

	@Override
	public String growth() {
		if (height <= 30) {
			setSize("small");
		} else {
			setSize("large");
		}
		//System.out.println("Crocodile is : " + getSize());
		return getSize();
	}

	
	@Override
	public void canSwim() {
		System.out.println("croc can swim");
	}

	@Override
	public void breathesUnderwater() {
		System.out.println("croc can breathe underwater");
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

}
