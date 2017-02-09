package hello;

public class Invertebrate extends Animal {

	public Invertebrate(String name, int age, String species, String gender, String size, int height, int weight,
			int waste, int foodmass, double growthFactor, int breathingRate) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);

	}

	@Override
	public String movement() {
		System.out.println("invert moves");
		return null;
	}

	@Override
	public String growth() {
		if (height <= 12) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	@Override
	public String reproduction() {
		return "Invertebrates reproduce differently to vertebrates";
	}
}
