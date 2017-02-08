package hello;

public class Pigeon extends Bird implements Flying {

	boolean endangered;

	public Pigeon(boolean endangered) {
		super();
		this.endangered = endangered;
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

	@Override
	public void nutrition() {

	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
