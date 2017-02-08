package hello;

public class Cat extends Mammal {

	private boolean endangered;
	private boolean nocturnal;

	public Cat(boolean endangered, boolean nocturnal) {
		super();
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
