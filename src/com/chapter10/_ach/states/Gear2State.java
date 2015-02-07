package com.chapter10._ach.states;

public class Gear2State implements IState {

	@Override
	public IState shiftUp() {
		System.out.println("3rd gear");
		return new Gear3State();
	}

	@Override
	public IState shiftDown() {
		System.out.println("1st gear");
		return new Gear1State();
	}

}
