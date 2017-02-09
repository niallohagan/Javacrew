package hello;

public class Animal implements LivingThings {

	private String name;
	private int age;
	private String species;
	private String gender;
	private String size;
	protected int height;
	private int weight;
	private double waste;

	public Animal(String name, int age, String species, String gender, String size, int height, int weight, double waste) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.size = size;
		this.height = height;
		this.weight = weight;
		this.waste = waste;

	}

	@Override
	public void excretion() {
		System.out.println("Animal excretes");
	}

	@Override
	public void reproduction() {
		if(species.equals("mammal")){
			System.out.println("Gives birth to live young");
		}else
			if(species.equals("amphibian")){
				System.out.println("Lays soft shelled eggs"); 
			}else
				if(species.equals("reptile")){
					System.out.println("Lays hard shelled eggs");
				}else
					if(species.equals("bird")){
						System.out.println("Lays eggs");
					}
					else{
						System.out.println("Lays eggs in water");
					}
	}

	@Override
	public void respiration() {
		System.out.println("Animal respires");
	}

	@Override
	public void movement() {
		if (size != "small") {
			System.out.println("Animal moves a lot and needs a large enclosure");
		} else {
			System.out.println("Animal can live in a small enclosure");
		}
	}

	@Override
	public void sensitivity() {
		System.out.println("Animal is sensitive");
	}

	@Override
	public void growth() {
		if (height <= 50) {
			size = "small";
		} else {
			size = "large";
		}
		System.out.println(size);
	}

	@Override
	public void nutrition() {
if(weight>70){
	System.out.println("Animal needs fed three times a day");
}else{
	System.out.println("One feeding a day is enough");
}
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
	
	public double getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

}
