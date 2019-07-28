package com.skilldistillery.jet;

public class Pilot {
	private String 	firstName;
	private String	lastName;
	private String	gender;
	private String  eIN;
	
	public void getPilotInfo() {
		
		System.out.print("First Name: " + firstName + "   Last Name: " + lastName
			+ "   Gender:" + gender + "   ID: " + eIN );
	}
	
	public Pilot(String firstName, String lastName, String gender, String eIN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.eIN = eIN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String geteIN() {
		return eIN;
	}

	public void seteIN(String eIN) {
		this.eIN = eIN;
	}

	public Pilot() {
		// TODO Auto-generated constructor stub
	}
}
