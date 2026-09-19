package com.omrbranch.stepdefinition;


public class TestFile {
	public void empId(int id) {
        System.out.println("Employee ID (int): " + id);
    }

    public void empId(String id) {
        System.out.println("Employee ID (String): " + id);
    }

    public void empId(double id) {
        System.out.println("Employee ID (double): " + id);
    }

    public void empId(int id, String name) {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    
}
