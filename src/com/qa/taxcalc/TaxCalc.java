package com.qa.taxcalc;

public class TaxCalc {

	public void printName(String name) {
		System.out.println("This is the user name: " + name);
	}

	public void printSalary(Double amount) {
		System.out.println("This is the annual salary: " + amount);
		System.out.println("This is the monthly salary: " + (amount / 12));
		System.out.println("This is the daily salary: " + (amount / 365));
	}

	public void taxCalculator(Double amount) {
		if (amount < 21000) {
			System.out.println("you are paying 10% tax: " + (amount * 0.1));
		} else if (amount < 32500) {
			System.out.println("you are paying 20% tax: " + (amount * 0.2));
		} else {
			System.out.println("you are paying 40% tax: " + (amount * 0.4));
		}
	}

}
