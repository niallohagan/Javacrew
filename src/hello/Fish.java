package hello;

public class Fish extends Animal implements Swim {

	private boolean abilityToSwim;

	public Fish(String name, int age, String species, String gender, String size, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);

	}

	@Override
	public String growth() {
		if (height <= 25) {
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

	public boolean isAbilityToSwim() {
		return abilityToSwim;
	}

	public void setAbilityToSwim(boolean abilityToSwim) {
		this.abilityToSwim = abilityToSwim;
	}

}
