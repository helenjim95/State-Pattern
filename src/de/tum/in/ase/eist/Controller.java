package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;


// TODO: context class
public class Controller {

//	TODO: add a reference field of the state interface type
	private ElevatorState state;

	private int currentFloor;

	private final List<Integer> pool;

//	TODO: Initialize state
	public Controller(int currentFloor) {
		this.currentFloor = currentFloor;
		state = new IdleState();
		pool = new ArrayList<>();
	}

	public ElevatorState getState() {
		return state;
	}

//	TODO:  public setter that allows overriding the state
	public void setState(ElevatorState state) {
		this.state = state;
	}

//	TODO: Replace empty state conditionals with calls to corresponding methods of the state object.
	public void request(int floor) {
		if (floor != currentFloor && !pool.contains(floor)) {
			pool.add(floor);
		}
//		TODO: example
		state.request(floor, this);
	}

	public void signal(int floor) {
		currentFloor = floor;
//		TODO: example
		state.signal(floor, this);
	}

	public List<Integer> getPool() {
		return pool;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getNextStop() {
		if (pool.isEmpty()) {
			return -1;
		}
		return pool.get(0);
	}
}
