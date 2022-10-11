package com;
/*Problem 2 :

Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)*/

//Multi-level inheritance
class A { // base class
	void Eat() { // method
		System.out.println("Eat");
	}

}

class B extends A { // child class 1
	void Rice() { // method
		System.out.println("Rice");
	}
}

class C extends B { // child class 2
	void Meat() { // method
		System.out.println("Meat");
	}

	public static void main(String[] args) { // main method
		C obj = new C(); // creating object
		// calling methods
		obj.Eat();
		obj.Rice();
		obj.Meat();
	}
}
