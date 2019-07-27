package com.skilldistillery.jet;

public class AEWACS extends Jet implements NonCombat {

	public AEWACS(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public AEWACS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println("Collecting airspace data for Command and Control!");
	}

	@Override
	public void unload() {
		System.out.println("Distributing airspace data to mission package.");
	}

}
