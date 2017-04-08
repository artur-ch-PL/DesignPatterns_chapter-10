package com.chapter10._ach.main;

public class Break {
	
	static final int RPM_TO_CHANGE_GEAR = 1700;
	static final int RPM_TO_INCREASE_AFTER_CHANGE_GEAR = 1200;
	
	static void slowDown(int timeInSeconds, int decreasingRPM, ContextGearBox gearBox){
		
		System.out.println("Break for " + timeInSeconds + "s");
		
		for(int secondsLeft = 0; secondsLeft < timeInSeconds; secondsLeft++){
			Main.RPM -= decreasingRPM;
			while (Main.RPM <= RPM_TO_CHANGE_GEAR) {
				gearBox.shiftDown();
				Main.RPM += RPM_TO_INCREASE_AFTER_CHANGE_GEAR;
			}
			
		}
		
	}
}
