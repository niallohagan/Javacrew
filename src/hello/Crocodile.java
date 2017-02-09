package hello;

public class Crocodile extends Reptile implements Swim {

	private boolean abilityToSwim;
	boolean endangered;
	boolean dangerous;

	public Crocodile(String name, String species, String gender, String size, int age, int height, int weight,
			int waste, int foodmass, double growthFactor, int breathingRate, boolean dangerous, boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor, breathingRate);
		this.endangered = endangered;
		this.dangerous = dangerous;
	}

	@Override
	public String growth() {
		if (height <= 30) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	@Override
	public String canSwim() {
		if (abilityToSwim == true) {
			return "enclosure needs a pool";
		} else {
			return "enclosure doesnt need a pool";
		}
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

	public boolean getAbilityToSwim() {
		return abilityToSwim;
	}

	public void setAbilityToSwim(boolean abilityToSwim) {
		this.abilityToSwim = abilityToSwim;
	}

}
