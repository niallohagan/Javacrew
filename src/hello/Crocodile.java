package hello;

public class Crocodile extends Reptile implements Swim {

	boolean endangered;
	boolean dangerous;

	public Crocodile(String name, String species, String gender, String size, int age, int height, int weight, double waste,
			boolean dangerous, boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste);
		this.endangered = endangered;
		this.dangerous = dangerous;
	}

	@Override
	public void growth() {
		if (height <= 30) {
			setSize("small");
		} else {
			setSize("large");
		}
		System.out.println("Crocodile is : " + getSize());
	}

	@Override
	public void nutrition() {
		System.out.println("croc eats");
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
