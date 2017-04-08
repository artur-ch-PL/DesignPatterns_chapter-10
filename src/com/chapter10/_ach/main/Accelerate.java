package com.chapter10._ach.main;

public class Accelerate {

	static final int RPM_TO_SHIFT_UP = 3000;
	static final int RPM_TO_DECRESE_AFTER_CHANGE_GEAR = 1000;
	
	static void speedUp(int timeInSeconds, int increasingRPM, ContextGearBox gearBox) {
		
		System.out.println("Acceleration " + increasingRPM + "RPM by " + timeInSeconds + "s");
		
		for (int second = 0; second < timeInSeconds; second++) {
			Main.RPM += increasingRPM;
			while (Main.RPM >= RPM_TO_SHIFT_UP) {
				gearBox.shiftUp();
				Main.RPM -= RPM_TO_DECRESE_AFTER_CHANGE_GEAR;
			}
		}
		
	}
}
