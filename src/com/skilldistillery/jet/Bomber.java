package com.skilldistillery.jet;

public class Bomber extends Jet implements Combat {

	public Bomber(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public Bomber() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Dropping payload!");

	}

	@Override
	public void evade() {
		System.out.println("launching flares!");
	}

}
