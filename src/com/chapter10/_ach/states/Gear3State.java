package com.chapter10._ach.states;

public class Gear3State implements IState {

	@Override
	public IState shiftUp() {
		System.out.println("4th gear");
		return new Gear4State();
	}

	@Override
	public IState shiftDown() {
		System.out.println("2nd gear");
		return new Gear2State();
	}

}
