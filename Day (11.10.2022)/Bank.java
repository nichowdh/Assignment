package com;

/*Problem 3:

Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest*/

class Bank { // base class

}

class ICICI extends Bank { // clild class 1

	int rateOfInterest() { // integer type method
		return 9;
	}

}

class Axis extends Bank { // child class 2

	int rateOfInterest() {// integer type method
		return 7;
	}

}

class SBI extends Bank { // child class 3

	int rateOfInterest() { // integer type method
		return 8;
	}

	public static void main(String[] args) { // main method
		// creating objects
		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();
		System.out.println("SBI rate of interest: " + s.rateOfInterest());
		System.out.println("ICICI rate of interest: " + i.rateOfInterest());
		System.out.println("AXIS rate of interest: " + a.rateOfInterest());

	}

}
