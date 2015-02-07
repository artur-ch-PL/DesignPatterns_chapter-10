package com.chapter10._ach.main;

public class Accelerate {

	static void speedUp(int timeS, int increasingRPM, ContextGearBox gearBox) {
		System.out.println("Acceleration " + increasingRPM + "RPM by " + timeS + "s");
		for (int i = 0; i < timeS; i++) {
			Main.RPM += increasingRPM;
			while (Main.RPM > 3000) {
				gearBox.shiftUp();
				Main.RPM -= 1000;
			}
		}
	}
}
