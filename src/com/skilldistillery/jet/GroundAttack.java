package com.skilldistillery.jet;

public class GroundAttack extends Jet implements Combat {

	public GroundAttack(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public GroundAttack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Strafing enemy ground units at position @#$R@#RQ!");
	}

	@Override
	public void evade() {
		System.out.println("Evading ground to air artillery!");		
	}

}
