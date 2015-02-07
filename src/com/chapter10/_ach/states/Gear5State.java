package com.chapter10._ach.states;

public class Gear5State implements IState {

	@Override
	public IState shiftUp() {
		System.err.println("You push too hard");
		return new IdleState();
	}

	@Override
	public IState shiftDown() {
		System.out.println("4th gear");
		return new Gear4State();
	}


}
