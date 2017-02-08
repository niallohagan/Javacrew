package hello;

public class Crocodile extends Reptile implements Swim {

	boolean endangered;
	boolean dangerous;

	public Crocodile(String name, String species, String gender, String size, int age, int height, int weight, boolean dangerous, boolean endangered) {
		super(name, age, gender, size, species, height, weight);
		this.endangered = endangered;
		this.dangerous = dangerous;
	}

	@Override
	public void nutrition() {

	}

	@Override
	public void emerge() {

	}

	@Override
	public void floats() {

	}

	@Override
	public void submerge() {

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
