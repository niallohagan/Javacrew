package hello;

public class Bat extends Mammal implements Flying {

	boolean nocturnal;
	boolean endangered;

	public Bat(boolean nocturnal, boolean endangered) {
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
