package de.tum.in.ase.eist;

import java.util.*;

public class Controller {

	private int currentFloor;
	private List<Integer> pool = new ArrayList<Integer>();
	private ElevatorState state;


	public Controller(int currentFloor) {
		this.state = new Idle();
	}

	public void request(int floor) {
		pool.add(floor);
		state = new Moving();
	}

	public void signal(int floor) {
		if (pool.isEmpty()) {
			state = new Idle();
		}
		state.signal(floor, this);
	}

	public ElevatorState getState() {
		return this.state;
	}

	public void setState(ElevatorState newState) {
		this.state = newState;
	}

	public int getNexthop() {
		if (this.pool.size() > 0) {
			return this.pool.get(0);
		} else {
			return -1;
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public List<Integer> getPool() {
		return pool;
	}

	public void setPool(List<Integer> pool) {
		this.pool = pool;
	}
}
