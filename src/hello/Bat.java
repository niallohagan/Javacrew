package hello;

public class Bat extends Mammal implements Flying {

	private boolean canFly;
	private int landingSpeed;
	private int optimalFlightTime;
	private int takeOffSpeed;
	private int power;
	private boolean nocturnal;
	private boolean endangered;
/*
	public Bat(String name, String species, String gender, String size, int age, int height, int weight, int waste,
			int foodmass, int speed, int sprintFactor, double growthFactor, int power, boolean nocturnal,
			boolean endangered) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, foodmass, power, speed,
				sprintFactor);
		this.nocturnal = nocturnal;
		this.endangered = endangered;
	}
*/
	
	public Bat(String species, String gender) {

		super(species, gender);

	}

	
	@Override
	public String growth() {
		if (height <= 20) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}

	@Override
	public String flight() {
		int flightTime = 0;
		if (flightTime <= optimalFlightTime) {
			return "Bat has a lovely flight";
		} else {
			return "Bat crashes";
		}
	}

	@Override
	public String movement() {
		if (canFly == true) {
			return "Bat needs an enclosure large enough to fly in";
		} else {
			return "Bat doesnt necessarily need an enclosure large enough to fly in";
		}
	}

	@Override
	public String landing() {
		int speed = 0;
		if (speed == landingSpeed) {
			return "safe landing";
		} else {
			return "crash landing";
		}

	}

	@Override
	public String takeOff() {
		if (takeOffSpeed > 18) {
			return "Take off successful";
		} else {
			return "take off not successful";
		}
	}

	public boolean isNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}

	public int getTakeOffSpeed() {
		return takeOffSpeed;
	}

	public void setTakeOffSpeed(int takeOffSpeed) {
		this.takeOffSpeed = takeOffSpeed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getOptimalFlightTime() {
		return optimalFlightTime;
	}

	public void setOptimalFlightTime(int optimalFlightTime) {
		this.optimalFlightTime = optimalFlightTime;
	}

	public int getLandingSpeed() {
		return landingSpeed;
	}

	public void setLandingSpeed(int landingSpeed) {
		this.landingSpeed = landingSpeed;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
