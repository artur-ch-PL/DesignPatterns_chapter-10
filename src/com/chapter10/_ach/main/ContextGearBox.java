package com.chapter10._ach.main;

import com.chapter10._ach.states.Gear1State;
import com.chapter10._ach.states.Gear2State;
import com.chapter10._ach.states.Gear3State;
import com.chapter10._ach.states.Gear4State;
import com.chapter10._ach.states.Gear5State;
import com.chapter10._ach.states.GearRState;
import com.chapter10._ach.states.IState;
import com.chapter10._ach.states.IdleState;

public final class ContextGearBox {
	private static IState currentState;
	IState idleState = new IdleState();
	IState gearRState = new GearRState();
	IState gear1State = new Gear1State();
	IState gear2State = new Gear2State();
	IState gear3State = new Gear3State();
	IState gear4State = new Gear4State();
	IState gear5State = new Gear5State();
	
	public ContextGearBox(){
		currentState = idleState;
	}
	
	public IState shiftUp(){
		currentState = currentState.shiftUp();
		return currentState;
	}

	public IState shiftDown(){
		currentState = currentState.shiftDown();
		return currentState;
	}

}
