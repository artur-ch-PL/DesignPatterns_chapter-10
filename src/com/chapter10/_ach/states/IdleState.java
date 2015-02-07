package com.chapter10._ach.states;

public class IdleState implements IState {

	@Override
	public IState shiftUp() {
		System.out.println("1st gear");
		return new Gear1State();
	}

	@Override
	public IState shiftDown() {
		System.out.println("You are on the idle state, because yours RPM are too low to be on 1st gear.");
		return new GearRState();
	}

	public String toString(){
		return "Idle gear state";
	}
}
