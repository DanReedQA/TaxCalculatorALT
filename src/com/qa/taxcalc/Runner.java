package com.qa.taxcalc;

public class Runner {

	public static void main(String[] args) {

		String user = "John Smith";
		Double salary = 23000.00;

		TaxCalc calc = new TaxCalc();

		calc.printName(user);
		calc.printSalary(salary);
		calc.taxCalculator(salary);

	}

}
