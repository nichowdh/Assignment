package com;

class MathTeacher extends Teacher { // child calss 1
	public MathTeacher(String designation, String college, String work) {
		super(designation, college, work);
		// TODO Auto-generated constructor stub
	}

	void show() { // method
		System.out.println(designation + " " + college + " " + work);
	}

}

class MusicTeacher extends Teacher { // Child class 2
	public MusicTeacher(String designation, String college, String work) {
		super(designation, college, work);
		// TODO Auto-generated constructor stub
	}

	void show() { // method
		System.out.println(designation + " " + college + " " + work);
	}

}

class PsyTeacher extends Teacher { // Child class 3
	public PsyTeacher(String designation, String college, String work) {
		super(designation, college, work);
		// TODO Auto-generated constructor stub
	}

	void show() { // method
		System.out.println(designation + " " + college + " " + work);
	}

}

class ItTeacher extends Teacher { // Child class 4
	public ItTeacher(String designation, String college, String work) {
		super(designation, college, work);
		// TODO Auto-generated constructor stub
	}

	void show() { // method
		System.out.println(designation + " " + college + " " + work);
	}

	public static void main(String[] args) { // main method
		ItTeacher i = new ItTeacher("Senior-Teacher", "AOT", "It-Department");
		i.show();
		MathTeacher m = new MathTeacher("junior-Teacher", "Tpi", "Math-Department");
		m.show();
		MusicTeacher m1 = new MusicTeacher("Senior-teacher", "IEM", "Music department");
		m1.show();
		PsyTeacher p = new PsyTeacher("Juniot-teacher", "Kol", "Physics department");
		p.show();

	}

}
