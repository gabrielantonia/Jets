package com.skilldistillery.jet;

public abstract class Jet {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + range;
		result = prime * result + speed;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	private String model;
	private int speed;
	private int range;
	private int price;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nmodel=").append(model).append(", speed=").append(speed).append(", range=").append(range)
				.append(", price=").append(price).append("\n");
		return builder.toString();
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	public Jet(String model, int speed, int range, int price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public Jet() {
	}

	public void fly() {
		System.out.print(this.model);
		System.out.println(" is taking off!");
		System.out.println("In air time at a cruising speed of 300 mph is " + (this.range/300)+ " hours.");
		getSpeedInMach(this.speed);
		System.out.println("");
	}
	
	public void getSpeedInMach(int speed) {
		int speedMach = speed/767;
		if(speedMach== 0) {
			System.out.println(this.model + " cannot reach Mach speeds.");
		}
		else {
			System.out.println(this.model + " has a max speed of Mach "+ speedMach + ".");
		}
	
	}
}
