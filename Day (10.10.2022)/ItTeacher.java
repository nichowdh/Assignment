package com;

class MathTeacher extends Teacher // child calss 1
{

}

class MusicTeacher extends Teacher { // Child class 2

}

class PsyTeacher extends Teacher { // Child class 3

}

class ItTeacher extends Teacher { // Child class 4

	public static void main(String[] args) { // main method
		ItTeacher i = new ItTeacher();
		i.work("Senior-Teacher", "AOT");
		MathTeacher m = new MathTeacher();
		m.work("junior-Teacher", "Tpi");
		MusicTeacher m1 = new MusicTeacher();
		m1.work("Senior-teacher", "IEM");
		PsyTeacher p = new PsyTeacher();
		p.work("Juniot-teacher", "Kol");

	}

}
