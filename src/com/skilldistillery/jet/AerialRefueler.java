package com.skilldistillery.jet;

public class AerialRefueler extends Jet implements NonCombat {

	public AerialRefueler(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public AerialRefueler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println("Filling fuel tanks for refueling.");
		// TODO Auto-generated method stub

	}

	@Override
	public void unload() {
		System.out.println("Commencing aeiral refueling procedure.");
	}

}
