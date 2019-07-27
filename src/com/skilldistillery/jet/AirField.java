package com.skilldistillery.jet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	private List<Jet> jets = new ArrayList<>();

	public AirField() {
	}

	public ArrayList<Jet> getAirfield() {
		return getAirfield();
	}

	public void setAirfield(ArrayList<Jet> jets) {
		this.jets = jets;
	}

	public void addJetToHangar(Jet jet) {
		this.jets.add(jet);

	}

	public void removeJetFromHangar(int index) {
		this.jets.remove(index + 1);
	}

	public void listFleet() {
		int counter = 1;
		for (Jet jet : jets) {
			System.out.println("" + counter + ". \tModel: " + jet.getModel() + "   Max Speed: " + jet.getSpeed()
					+ "   Max Range:" + jet.getRange() + "   Price: " + jet.getPrice() + "\n");
			counter++;
		}
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}

	}

	public void viewFastestJet() {
		int jetSpeed = 0;
		Jet fastestJet = null;
		for (Jet jet : jets) {
			if (jet.getSpeed() > jetSpeed) {
				jetSpeed = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println(fastestJet);
	}

	public void viewJetWithLongestRange() {
		int jetRange = 0;
		Jet maxRangeJet = null;
		for (Jet jet : jets) {
			if (jet.getRange() > jetRange) {
				jetRange = jet.getRange();
				maxRangeJet = jet;
			}
		}
		System.out.println(maxRangeJet);
	}

	public void nonCombatCapabilities() {
		for (Jet jet : jets) {
			if (jet instanceof MilitaryTransport) {
				System.out.print(jet.getModel() + " ");
				((MilitaryTransport) jet).load();
			}
			if (jet instanceof AerialRefueler) {
				System.out.print(jet.getModel() + " ");
				((AerialRefueler) jet).load();
			}
			if (jet instanceof AEWACS) {
				System.out.print(jet.getModel() + " ");
				((AEWACS) jet).load();
			}
		}
		for (Jet jet : jets) {
			if (jet instanceof MilitaryTransport) {
				System.out.print(jet.getModel() + " ");
				((MilitaryTransport) jet).unload();
			}
			if (jet instanceof AerialRefueler) {
				System.out.print(jet.getModel() + " ");
				((AerialRefueler) jet).unload();
			}
			if (jet instanceof AEWACS) {
				System.out.print(jet.getModel() + " ");
				((AEWACS) jet).unload();
			}

		}

	}

	public void combatCapabilities() {
		for (Jet jet : jets) {
			if (jet instanceof Fighter) {
				System.out.print(jet.getModel() + " ");
				((Fighter) jet).attack();
			}
			if (jet instanceof GroundAttack) {
				System.out.print(jet.getModel() + " ");
				((GroundAttack) jet).attack();
			}
			if (jet instanceof Bomber) {
				System.out.print(jet.getModel() + " ");
				((Bomber) jet).attack();
			}
		}
		for (Jet jet : jets) {
			if (jet instanceof Fighter) {
				System.out.print(jet.getModel() + " ");
				((Fighter) jet).evade();
			}
			if (jet instanceof GroundAttack) {
				System.out.print(jet.getModel() + " ");
				((GroundAttack) jet).evade();
			}
			if (jet instanceof Bomber) {
				System.out.print(jet.getModel() + " ");
				((Bomber) jet).evade();
			}

		}
	}

	public void addJet(Scanner scan) {

		System.out.println("Select Aircraft Type:");
		System.out.println("1. Fighter");
		System.out.println("2. Ground Attack");
		System.out.println("3. Bomber");
		System.out.println("4. Military Transport");
		System.out.println("5. AerialRefueler");
		System.out.println("6. AEWACS");
		System.out.println("7. Back");

		int type = scan.nextInt();

		if (type == 7) {
			return;
		}
		System.out.print("What is the Aircraft Model: ");
		String model = scan.next();

		System.out.println("What is the max speed: ");
		Integer speed = scan.nextInt();

		System.out.println("What is the max range: ");
		Integer range = scan.nextInt();

		System.out.println("What is the price: ");
		Integer price = scan.nextInt();

		Jet jet = null;
		switch (type) {
		case 1:
			jet = new Fighter(model, speed, range, price);
			break;
		case 2:
			jet = new GroundAttack(model, speed, range, price);
			break;
		case 3:
			jet = new Bomber(model, speed, range, price);
			break;
		case 4:
			jet = new MilitaryTransport(model, speed, range, price);
			break;
		case 5:
			jet = new AerialRefueler(model, speed, range, price);
			break;
		case 6:
			jet = new AEWACS(model, speed, range, price);
			break;
		case 7:
			return;
		default:
			System.out.println("Select valid option:");
			return;
		}
		jets.add(jet);
	}

	public void removeJet(Scanner scan) {
		System.out.println("Select which Aircraft to remove from the hangar: \n");
		listFleet();
		int choice = scan.nextInt();

		if (choice <= jets.size()) {
			System.out.print(jets.get((choice - 1)) + "has been removed from the hangar.");
			jets.remove(choice - 1);
		} else {
			System.out.println("Select valid option:");
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("").append(jets).append("");
		return builder.toString();
	}

}
