package hello;

public class Animal implements LivingThings {

	private String name;
	private int age;
	private String species;
	private String gender;
	private String size;
	private int height;
	private int weight;

	public Animal(String name, int age, String species, String gender, String size, int height, int weight) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.size = size;
		this.height = height;
		this.weight = weight;

	}

	@Override
	public void excretion() {

	}

	@Override
	public void reproduction() {

	}

	@Override
	public void respiration() {

	}

	@Override
	public void movement() {

	}

	@Override
	public void sensitivity() {

	}

	@Override
	public void growth() {

	}

	@Override
	public void nutrition() {

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

}
