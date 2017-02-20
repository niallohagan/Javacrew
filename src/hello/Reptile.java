package hello;

public class Reptile extends Animal {
/*
	public Reptile(String name, int age, String species, String gender, String size, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);

	}
	*/
	public Reptile(String species, String gender) {

		super(species, gender);

	}

	

	@Override
	public String growth() {
		if (height <= 20) {
			setSize("small");
		} else {
			setSize("large");
		}

		return getSize();
	}

	protected void setSize(String string) {
		// TODO Auto-generated method stub
		
	}
}
