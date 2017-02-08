package hello;

public class Snake extends Reptile {

	private boolean poisonous;
	private boolean venomous;
	private boolean nocturnal;
	private boolean dangerous;
	private boolean endangered;

	public Snake(boolean poisonous, boolean venomous, boolean nocturnal, boolean dangerous, boolean endangered) {
		super(gender, age, gender, gender, gender, age, age, poisonous, venomous, nocturnal, dangerous, endangered);
		this.poisonous = poisonous;
		this.venomous = venomous;
		this.nocturnal = nocturnal;
		this.dangerous = dangerous;
		this.endangered = endangered;
	}

	@Override
	public void movement() {

	}

	@Override
	public void nutrition() {

	}

	public void shedSkin() {

	}

	public boolean isPoisonous() {
		return poisonous;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
