package hello;

public class Cat extends Mammal {

	private boolean endangered;
	private boolean nocturnal;

	public Cat(String name, String species, String gender, String size, int age, int height, int weight, boolean nocturnal, boolean endangered) {
		super(name, age, gender, size, species, height, weight);
		this.endangered = endangered;
		this.nocturnal = nocturnal;
	}

	@Override
	public void nutrition() {

	}

	@Override
	public void sprint() {

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
