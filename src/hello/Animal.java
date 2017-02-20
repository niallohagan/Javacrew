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
	
	private Animal(AnimalBuilder builder) {

		this.name = builder.name;

		this.age = builder.age;

		this.species = builder.species;

		this.gender = builder.gender;

		this.size = builder.size;

		this.height = builder.height;

		this.weight = builder.weight;

		this.waste = builder.waste;

		this.foodmass = builder.foodmass;

		this.growthFactor = builder.growthFactor;

		this.breathingRate = builder.breathingRate;

	}
/*
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
	*/
	public Animal(String species, String gender) {	}
	
	public String getName() {
		return name;
	}

	//public void setName(String name) {
		//this.name = name;
	//}

	public int getAge() {
		return age;
	}

	//public void setAge(int age) {
		//this.age = age;
	//}

	public String getSpecies() {
		return species;
	}

	//public void setSpecies(String species) {
		//this.species = species;
	//}

	public String getGender() {
		return gender;
	}

	//public void setGender(String gender) {
		//this.gender = gender;
	//}

	public String getSize() {
		return size;
	}

	//public void setSize(String size) {
		//this.size = size;
	//}

	public int getHeight() {
		return height;
	}

	//public void setHeight(int height) {
		//this.height = height;
	//}

	public int getWeight() {
		return weight;
	}

	//public void setWeight(int weight) {
		//this.weight = weight;
	//}

	public int getWaste() {
		return waste;
	}

	//public void setWaste(int waste) {
	//	this.waste = waste;
	//}

	public int getFoodmass() {
		return foodmass;
	}

	//public void setFoodmass(int foodmass) {
	//	this.foodmass = foodmass;
	//}

	public double getGrowthFactor() {
		return growthFactor;
	}

	//public void setGrowthFactor(double growthFactor) {
		//this.growthFactor = growthFactor;
	//}

	public int getBreathingRate() {
		return breathingRate;
	}

	//public void setBreathingRate(int breathingRate) {
	//	this.breathingRate = breathingRate;
	//}


	public static class AnimalBuilder {
		private String name; 
		private int age;
		private String species;
		private String gender;
		private String size;
		private int height;
		private int weight; 
		private int waste;
		private int foodmass;
		private double growthFactor;
		private int breathingRate;	
		
		public AnimalBuilder setName(String name){
			this.name = name;
			return this;
		}
		
		public AnimalBuilder setAge(int age){
			this.age = age;
			return this;
		}
		
		public AnimalBuilder setSpecies(String species){
			this.species = species;
			return this;
		}
		
		public AnimalBuilder setGender(String gender){
			this.gender = gender;
			return this;
		}
		
		public AnimalBuilder setSize(String size){
			this.size = size;
			return this;
		}
		
		public AnimalBuilder setHeight(int height){
			this.height = height;
			return this;
		}
		
		public AnimalBuilder setWeight(int weight){
			this.weight = weight;
			return this;
		}
		
		public AnimalBuilder setWaste(int waste){
			this.waste = waste;
			return this;
		}
		
		public AnimalBuilder setFoodmass(int foodmass){
			this.foodmass = foodmass;
			return this;
		}
		
		public AnimalBuilder setGowthFactor(double growthFactor){
			this.growthFactor = growthFactor;
			return this;
		}
		
		public AnimalBuilder setBreathingRate(int breathingRate){
			this.breathingRate = breathingRate;
			return this;
		}
		
		public Animal createAniaml(){ 
			return new Animal(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);
		}

		
		
	public int nutrition() {
		weight = weight + foodmass;

		return weight;
	}

	public double excretion() {
		waste = foodmass / 5;
		weight = weight - waste;

		return weight;
	}

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

	public String respiration() {
		if (breathingRate < 100) {
			return "animal is healthy";
		} else if (breathingRate == 0) {
			return "animal is dead";
		} else {
			return "animal needs medical aid";
		}
	}

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

	public String growth() {
		if (height <= 50) {
			size = "small";
		} else {
			size = "large";
		}

		return size;
	}

	}

}
