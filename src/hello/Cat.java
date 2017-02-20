package hello;

public class Cat extends Mammal {

	private boolean endangered;
	private boolean nocturnal;
/*
	public Cat(String name, String species, String gender, String size, int age, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate, int speed, int sprintFactor, boolean nocturnal,
			boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor, breathingRate, speed,
				sprintFactor);
		this.endangered = endangered;
		this.nocturnal = nocturnal;
	}
*/
	
	public Cat(String species, String gender) {

		super(species, gender);

	}

	
	@Override
	public String growth() {
		if (height <= 30) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

}
