package hello;

public class Animal implements LivingThings {

	private String name;
	private int age;
	private String species;
	private String gender;
	private String size;
	protected int height;
	private int weight;
	private int waste;
	private int foodmass;
	private double growthFactor;
	private int breathingRate;

	public Animal(String name, int age, String species, String gender, String size, int height, int weight, int waste,
			int foodmass, double growthFactor, int breathingRate) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.size = size;
		this.height = height;
		this.weight = weight;
		this.waste = waste;
		this.foodmass = foodmass;
		this.growthFactor = growthFactor;
		this.breathingRate = breathingRate;

	}

	@Override
	public int nutrition() {
		weight = weight + foodmass;

		return weight;
	}

	@Override
	public double excretion() {
		waste = foodmass / 5;
		weight = weight - waste;

		return weight;
	}

	@Override
	public String reproduction() {
		if ("mammal".equals(species)) {
			return "Gives birth to live young";
		} else if ("amphibian".equals(species)) {
			return "Lays soft shelled eggs";
		} else if ("reptile".equals(species)) {
			return "Lays hard shelled eggs";
		} else if ("bird".equals(species)) {
			return "Lays eggs";
		} else {
			return "Lays eggs in water";
		}

	}

	@Override
	public String respiration() {
		if (breathingRate < 100) {
			return "animal is healthy";
		} else if (breathingRate == 0) {
			return "animal is dead";
		} else {
			return "animal needs medical aid";
		}
	}

	@Override
	public String movement() {
		if (size != "small") {
			return "Large enclosure";
		} else {
			return "Small enclosure";
		}

	}

	public double size() {
		height = (int) (height * growthFactor);

		return height;
	}

	@Override
	public String growth() {
		if (height <= 50) {
			size = "small";
		} else {
			size = "large";
		}

		return size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

	public int getFoodmass() {
		return foodmass;
	}

	public void setFoodmass(int foodmass) {
		this.foodmass = foodmass;
	}

	public double getGrowthFactor() {
		return growthFactor;
	}

	public void setGrowthFactor(double growthFactor) {
		this.growthFactor = growthFactor;
	}

	public int getBreathingRate() {
		return breathingRate;
	}

	public void setBreathingRate(int breathingRate) {
		this.breathingRate = breathingRate;
	}

}
