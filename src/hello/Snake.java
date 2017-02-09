package hello;

public class Snake extends Reptile {

	private boolean poisonous;
	private boolean venomous;
	private boolean dangerous;
	private boolean endangered;

	public Snake(String name, String species, String gender, String size, int age, int height, int weight, int waste, int foodmass, double growthFactor,
			boolean poisonous, boolean endangered, boolean venomous, boolean dangerous) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor);
		this.poisonous = poisonous;
		this.venomous = venomous;
		this.dangerous = dangerous;
		this.endangered = endangered;
	}
	@Override
	public String growth() {
		if (height <= 10) {
			setSize("small");
		} else {
			setSize("large");
		}
		System.out.println("Snake is : " + getSize());
		return getSize();
	}

	@Override
	public String movement() {
		System.out.println("snake moves");
		return null;
	}

	
	public boolean isPoisonous() {
		return poisonous;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
