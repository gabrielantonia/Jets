package com.skilldistillery.jet;

public class Fighter extends Jet implements Combat{

	public Fighter(String model, int speed, int range, int price) {
		super(model, speed, range, price);
	}

	public Fighter() {
		
	}

	@Override
	public void attack() {
		System.out.println("Locking on target, apprehending enemy aircraft!");
	}

	@Override
	public void evade() {
		System.out.println("Evading enemy missle!");
	}

}
