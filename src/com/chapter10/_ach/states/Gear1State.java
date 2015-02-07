package com.chapter10._ach.states;

public class Gear1State implements IState {

	@Override
	public IState shiftUp() {
		System.out.println("2nd gear");
		return new Gear2State();
	}

	@Override
	public IState shiftDown() {
		System.out.println("Idle gear");
		return new IdleState();
	}

}
