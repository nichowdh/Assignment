/*Problem Code 1:

you will make a class ‘Rectangle’ and declare the variable
length and breadth as private. One Constructor will be used for 
initializing the value of variables. 

When an object is created, the constructor will be called and 
the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an 
object of class Rectangle and assign values of the parameter used 
in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. 
And then read the updated value. 

Sample Output:   

Area = 800

New area = 900*/
public class Rectangle { // 1st class
	private int length;
	private int breadth;

//default constructor
	Rectangle() {
		length = 10;
		breadth = 20;
		System.out.println("Area: " + (length * breadth));

	}

	// parameterised constructor
	Rectangle(int l, int b) {
		length = l;
		breadth = b;
		System.out.println("New area: " + l * b);
	}

	// method
	void getArea() {

		System.out.println(length * breadth);
	}

	public class RectangleTest { // 2nd class
		public static void main(String[] args) {
			// creating object
			Rectangle r1 = new Rectangle(); // 1st value
			Rectangle r2 = new Rectangle(20, 30); // updated value

		}

	}
}
