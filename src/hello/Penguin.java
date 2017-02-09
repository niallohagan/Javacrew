package hello;

public class Penguin extends Bird implements Swim {

	private boolean endangered;

	public Penguin(String name, String species, String gender, String size, int age, int height, int weight, double waste,
			boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste);
		this.endangered = endangered;
	}

	@Override
	public void canSwim() {
		System.out.println("penguin swims");
	}

	@Override
	public void breathesUnderwater() {
		System.out.println("Penguins dont actually breathe underwater but hold their breath for a long time.");
	}

	@Override
	public String nutrition() {
		System.out.println("Penguin eats");
		return null;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

}
