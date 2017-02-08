package hello;

public class Bat extends Mammal implements Flying {

	private boolean nocturnal;
	private boolean endangered;

	public Bat(String name, String species, String gender, String size, int age, int height, int weight, boolean nocturnal, boolean endangered) {
		super(name, age, gender, size, species, height, weight);
		this.nocturnal = nocturnal;
		this.endangered = endangered;
	}

	@Override
	public void nutrition() {

	}

	@Override 
	public void flight() {

	}

	@Override
	public void landing() {

	}

	@Override
	public void takeOff() {

	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
