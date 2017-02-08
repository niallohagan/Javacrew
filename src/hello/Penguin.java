package hello;

public class Penguin extends Bird implements Swim {

	private boolean endangered;

	public Penguin(String name, String species, String gender, String size, int age, int height, int weight, boolean endangered) {
		super(name, age, gender, size, species, height, weight);
		this.endangered = endangered;
	}

	@Override
	public void nutrition() {

	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	@Override
	public void submerge() {

	}

	@Override
	public void emerge() {

	}

	@Override
	public void floats() {

	}

}
