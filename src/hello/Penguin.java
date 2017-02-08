package hello;

public class Penguin extends Bird implements Swim {

	private boolean endangered;

	public Penguin(boolean endangered) {
		super();
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
