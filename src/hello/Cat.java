package hello;

public class Cat extends Mammal {

	private boolean endangered;
	private boolean nocturnal;

	public Cat(String name, String species, String gender, String size, int age, int height, int weight, double waste,
			boolean nocturnal, boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste);
		this.endangered = endangered;
		this.nocturnal = nocturnal;
	}

	@Override
	public void nutrition() {
		System.out.println("cat eats");
	}

	@Override
	public void sprint() {
		System.out.println("cat sprints");
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
