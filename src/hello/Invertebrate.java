package hello;

public class Invertebrate extends Animal {

	boolean reproduceSexually;
	boolean hasLegs;

	public Invertebrate(String name, int age, String species, String gender, String size, int height, int weight,
			int waste, int foodmass, double growthFactor, int breathingRate, boolean reproduceSexually,
			boolean hasLegs) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);
		this.reproduceSexually = reproduceSexually;
		this.hasLegs = hasLegs;
	}

	@Override
	public String movement() {
		if (hasLegs == true) {
			return "walks";
		} else {
			return "crawls";
		}
	}

	@Override
	public String growth() {
		if (height <= 12) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	@Override
	public String reproduction() {
		if (reproduceSexually == true) {
			return "reproduces sexually";
		} else {
			return "reproduces asexually";
		}
	}

	public boolean isReproduceSexually() {
		return reproduceSexually;
	}

	public void setReproduceSexually(boolean reproduceSexually) {
		this.reproduceSexually = reproduceSexually;
	}

	public boolean isHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}

}
