package com.skilldistillery.jet;

public abstract class Jet {

	private String model;
	private int speed;
	private int range;
	private int price;
	private Pilot pilot;

	public Pilot getPilot() {
		return pilot;
	}
	
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
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
