package hello;

public class Penguin extends Bird implements Swim {

	private boolean abilityToSwim;
	private boolean endangered;
/*
	public Penguin(String name, String species, String gender, String size, int age, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate, boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor, breathingRate);
		this.endangered = endangered;
	}
*/
	
	public Penguin(String species, String gender) {

		super(species, gender);

	}

	
	@Override
	public String growth() {
		if (height <= 35) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	private void setSize(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String canSwim() {
		if (abilityToSwim == true) {
			return "enclosure needs a pool";
		}
		return null;

	}

	public boolean isAbilityToSwim() {
		return abilityToSwim;
	}

	public void setAbilityToSwim(boolean abilityToSwim) {
		this.abilityToSwim = abilityToSwim;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
