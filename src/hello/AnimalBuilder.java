package hello;

public class AnimalBuilder {
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
	
	public AnimalBuilder(){
		//empty constructor
	}
	
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
	
	//public Animal createAniaml(){ 
		//return new Animal(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor, breathingRate);
	//}

}
