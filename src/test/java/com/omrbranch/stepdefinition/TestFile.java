package com.omrbranch.stepdefinition;

public class TestFile {
	public void names() {
		System.out.println("My name is krishna");
	}

	public void empId(int id) {
		System.out.println("Employee ID (pls): " + id);
	}

	public void empId(String id) {
		System.out.println("Employee ID (String): " + id);
	}

	public void empId(double id) {
		System.out.println("Employee ID (double): " + id);
}
	private void name() {
		System.out.println("Sudhaka");
		
	}

	public void empId(int id, String name) {
		System.out.println("Employee ID: " + id + ", Name: " + name);
		
		
	}

}
