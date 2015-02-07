package com.chapter10._ach.states;

public class Gear4State implements IState{

	@Override
	public IState shiftUp() {
		System.out.println("5th gear");
		return new Gear5State();
	}

	@Override
	public IState shiftDown() {
		System.out.println("3rd gear");
		return new Gear3State();
	}


}
