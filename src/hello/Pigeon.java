package hello;

public class Pigeon extends Bird implements Flying {

	
	private int optimalFlightTime;
	private int landingSpeed;
	private int takeOffSpeed;
	private int power;
	boolean endangered;

	public Pigeon(String name, String species, String gender, String size, int age, int height, int weight,
			int waste, int foodmass, double growthFactor, int breathingRate, int power,
			boolean endangered, int takeOffSpeed, int landingSpeed, int optimalFlightTime) {
		super(name, age, gender, size, species, height, weight, waste, foodmass, growthFactor, breathingRate);
		this.endangered = endangered;
		this.optimalFlightTime = optimalFlightTime;
		this.landingSpeed = landingSpeed;
		this.takeOffSpeed = takeOffSpeed;
		this.power = power;
		
	}

	@Override
	public String growth() {
		if (height <= 15) {
			setSize("small");
		} else {
			setSize("large");
		}
		return getSize();
	}
	@Override
	public String takeOff() {
		if (takeOffSpeed > 20 ) {
			return "Take off successful";
		} else {
            return "take off not successful";
		}
	}
	@Override
	public String landing(){
		int speed = 0;
		if(speed ==landingSpeed)
				{
			return "safe landing";
		}else{
			return "crash landing";
		}

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

	
	
	public boolean isEndangered() {
		return endangered;
	}

	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
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

	

}
