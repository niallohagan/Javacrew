package hello;

public class Reptile extends Animal {

	public Reptile(String name, int age, String species, String gender, String size, int height, int weight, int waste, int foodmass, double growthFactor) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor);

	}


	@Override
	public String growth() {
		if (height <= 20) {
			setSize("small");
		} else {
			setSize("large");
		}
		System.out.println("Reptile is : " + getSize());
		return null;
	}
}
