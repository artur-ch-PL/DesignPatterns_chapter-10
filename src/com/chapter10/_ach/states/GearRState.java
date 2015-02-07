package com.chapter10._ach.states;

public class GearRState implements IState {

	@Override
	public IState shiftUp() {
		System.out.println("Change to 1st gear");
		return new Gear1State();
	}

	@Override
	public IState shiftDown() {
		System.out.println("Change to idle state");
		return new IdleState();
	}


}
