package com.chapter10._ach.main;

public class Break {
	static void slowDown(int timeS, int decreasingRPM, ContextGearBox gearBox){
		System.out.println("Break " + decreasingRPM + "RPM by " + timeS + "s");
		for(int i = 0; i < timeS; i++){
			Main.RPM -= decreasingRPM;
			while (Main.RPM < 1700) {
				gearBox.shiftDown();
				Main.RPM += 1000;
			}
		}
	}
}
