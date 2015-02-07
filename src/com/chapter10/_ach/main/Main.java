package com.chapter10._ach.main;

public class Main {
	static int RPM = 0;

	public static void main(String[] args) {
		ContextGearBox contextGearBox = new ContextGearBox();
		Accelerate.speedUp(5, 1500, contextGearBox);
		Break.slowDown(2, 1500, contextGearBox);
	}

}
