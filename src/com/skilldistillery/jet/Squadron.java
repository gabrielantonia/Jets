package com.skilldistillery.jet;

import java.util.ArrayList;
import java.util.Scanner;

public class Squadron {

	private ArrayList<Pilot> pilots = new ArrayList<>();

	public void addPilots(Pilot pilot) {
		this.pilots.add(pilot);
	}

	public void getPilotInfo(int i) {
		Pilot pilot = pilots.get(i);
		System.out.print("First Name: " + pilot.getFirstName() + "   Last Name: " + pilot.getLastName() + "   Gender:"
				+ pilot.getGender() + "   ID: " + pilot.geteIN());
	}

	public Pilot getPilot(int i) {
		Pilot pilot = this.pilots.get(i);
		return pilot;
	}

	public void listPilots() {
		int counter = 1;
		for (Pilot pilot : pilots) {
			System.out.println("" + counter + ". \tFirst Name: " + pilot.getFirstName() + "   Last Name: "
					+ pilot.getLastName() + "   Gender:" + pilot.getGender() + "   ID: " + pilot.geteIN() + "\n");
			counter++;
		}
	}

	public Squadron() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(ArrayList<Pilot> pilots) {
		this.pilots = pilots;
	}

	public void removePilot(Scanner scan) {
		System.out.println("\nChoose pilot to remove from squadron: ");
		listPilots();
		int pilot = (scan.nextInt() - 1);
		this.getPilotInfo(pilot);
		System.out.println(" has been removed from the squadron.");
		pilots.remove(pilot);
	}

	public void addNewPilot(Scanner scan) {
		System.out.println("First Name: ");
		String firstName = scan.next();
		System.out.println("Last Name: ");
		String lastName = scan.next();
		System.out.println("Gender: ");
		String gender = scan.next();
		System.out.println("Employee ID: ");
		String eIN = scan.next();
		Pilot pilot = new Pilot(firstName, lastName, gender, eIN);
		pilots.add(pilot);
		pilot.getPilotInfo();
		System.out.println(" has been added to the squadron.");
	}
}
