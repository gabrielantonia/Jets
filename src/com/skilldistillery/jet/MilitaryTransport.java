package com.skilldistillery.jet;

public class MilitaryTransport extends Jet implements NonCombat {

	public MilitaryTransport(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public MilitaryTransport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println("Loading cargo and personnel");
	}

	@Override
	public void unload() {
		System.out.println("Unloading cargo and personnel");
	}

}
