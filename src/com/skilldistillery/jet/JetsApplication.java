package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {

		AirField airfield = new AirField();
		launch(airfield);
		displayUserMenu(airfield);

	}

	public static void launch(AirField airfield) {
		try (BufferedReader br = new BufferedReader(new FileReader("jetList.txt"))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] word = line.split(",");
				if (word[0].equals("Fighter")) {
					String model = word[1].trim();
					int maxSpeed = Integer.parseInt(word[2].trim());
					int maxRange = Integer.parseInt(word[3].trim());
					int price = Integer.parseInt(word[4].trim());
					Jet jet = new Fighter(model, maxSpeed, maxRange, price);
					airfield.addJetToHangar(jet);
				} else if (word[0].equals("Bomber")) {
					String model = word[1].trim();
					int maxSpeed = Integer.parseInt(word[2].trim());
					int maxRange = Integer.parseInt(word[3].trim());
					int price = Integer.parseInt(word[4].trim());
					Jet jet = new Bomber(model, maxSpeed, maxRange, price);
					airfield.addJetToHangar(jet);
				} else if (word[0].equals("GroundAttack")) {
					String model = word[1].trim();
					int maxSpeed = Integer.parseInt(word[2].trim());
					int maxRange = Integer.parseInt(word[3].trim());
					int price = Integer.parseInt(word[4].trim());
					Jet jet = new GroundAttack(model, maxSpeed, maxRange, price);
					airfield.addJetToHangar(jet);
				} else if (word[0].equals("MilitaryTransport")) {
					String model = word[1].trim();
					int maxSpeed = Integer.parseInt(word[2].trim());
					int maxRange = Integer.parseInt(word[3].trim());
					int price = Integer.parseInt(word[4].trim());
					Jet jet = new MilitaryTransport(model, maxSpeed, maxRange, price);
					airfield.addJetToHangar(jet);
				} else if (word[0].equals("AerialRefueler")) {
					String model = word[1].trim();
					int maxSpeed = Integer.parseInt(word[2].trim());
					int maxRange = Integer.parseInt(word[3].trim());
					int price = Integer.parseInt(word[4].trim());
					Jet jet = new AerialRefueler(model, maxSpeed, maxRange, price);
					airfield.addJetToHangar(jet);
				} else if (word[0].equals("AEWACS")) {
					String model = word[1].trim();
					int maxSpeed = Integer.parseInt(word[2].trim());
					int maxRange = Integer.parseInt(word[3].trim());
					int price = Integer.parseInt(word[4].trim());
					Jet jet = new AEWACS(model, maxSpeed, maxRange, price);
					airfield.addJetToHangar(jet);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void displayUserMenu(AirField airfield) {

		Scanner scan = new Scanner(System.in);
		boolean condition = true;
		while (condition) {
			System.out.println("\n1. List Fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all cargo jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to fleet");
			System.out.println("8. Remove a jet from the fleet");
			System.out.println("9. Quit");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				airfield.viewFastestJet();
				break;
			case 4:
				airfield.viewJetWithLongestRange();
				break;
			case 5:
				airfield.loadAllCargoJets();
				break;
			case 6:
				airfield.dogfight();
				break;
			case 7:
				airfield.addJet();
				break;
			case 8:
				airfield.removeJet();
				break;
			case 9:
				condition = false;
				break;
			default:
				System.out.println("Select valid option: ");
				break;
			}
		}
	}
}
