package hello;

public class Amphibian extends Animal implements Swim {

	public Amphibian(String name, int age, String species, String gender, String size, int height, int weight, int waste, int foodmass, double growthFactor) {
		super(name, age, species, gender, size, height, weight, waste, foodmass, growthFactor);

	}

	/*@Override
	public 	int nutrition() {
		setWeight(getWeight()+getFoodmass());
		System.out.println(getWeight());
		return getWeight();
	}*/

	
	@Override
	public String growth() {
		System.out.println("amphibian grows");
		return null;
	}

	@Override
	public void canSwim() {
		System.out.println("amphibian can swim");
		
	}

	@Override
	public void breathesUnderwater() {
		
		System.out.println("amphibian can breathe underwater");
	}
}
