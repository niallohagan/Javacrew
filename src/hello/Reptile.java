package hello;

public class Reptile extends Animal {

	public Reptile(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		super(name, age, species, gender, size, height, weight, waste);

	}


	@Override
	public void growth() {
		if (height <= 20) {
			setSize("small");
		} else {
			setSize("large");
		}
		System.out.println("Reptile is : " + getSize());
	}
}
