package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class JetsApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AirField airfield = new AirField();
		Squadron squadron = new Squadron();
		launch(airfield);
		enlistPilots(squadron, airfield, scan);
		airfield.assignInitialPilot(squadron);
		displayUserMenu(airfield, scan, squadron);
		scan.close();
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
			e.printStackTrace();
		}
	}

	public static void enlistPilots(Squadron squadron, AirField airfield, Scanner scan) {
		try (BufferedReader br = new BufferedReader(new FileReader("pilots.txt"))) {
			String lines;

			while ((lines = br.readLine()) != null) {
				String[] line = lines.split(",");
				String firstName = line[0];
				String lastName = line[1];
				String gender = line[2];
				String eIN = line[3];
				Pilot pilot = new Pilot(firstName, lastName, gender, eIN);
				squadron.addPilots(pilot);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void displayUserMenu(AirField airfield, Scanner scan, Squadron squadron) {

		System.out.println("Welcome Commander to your new duty station. What would you like to do:");
		boolean condition = true;
		while (condition) {
			System.out.println("\n1. List Fleet");
			System.out.println("2. Fly a jet");
			System.out.println("3. Fly all jets");
			System.out.println("4. View fastest jet");
			System.out.println("5. View jet with longest range");
			System.out.println("6. Demonstrate non-combat capabilities");
			System.out.println("7. Demonstrate combat capabilities");
			System.out.println("8. Add a jet to fleet");
			System.out.println("9. Remove a jet from the fleet");
			System.out.println("10. View a list of registered pilots");
			System.out.println("11. Assign pilot to aircraft");
			System.out.println("12. Add a new pilot to the squadron");
			System.out.println("13. Remove a pilot from the squadron");
			System.out.println("14. Quit");

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				airfield.listFleet(squadron);
				break;
			case 2:
				airfield.flyJet(scan, squadron);
				break;
			case 3:
				airfield.flyAllJets();
				break;
			case 4:
				airfield.viewFastestJet();
				break;
			case 5:
				airfield.viewJetWithLongestRange();
				break;
			case 6:
				airfield.nonCombatCapabilities();
				break;
			case 7:
				airfield.combatCapabilities();
				break;
			case 8:
				airfield.addJet(scan, squadron);
				break;
			case 9:
				airfield.removeJet(scan, squadron);
				break;
			case 10:
				squadron.listPilots();
				break;
			case 11:
				airfield.assignPilot(scan, squadron, airfield);
				break;
			case 12:
				squadron.addNewPilot(scan);
				break;
			case 13:
				squadron.removePilot(scan);
				break;
			case 14:
				condition = false;
				break;
			default:
				System.out.println("Select valid option: ");
				break;
			}
		}
	}
}
