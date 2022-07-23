package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	private ElevatorState state;

	private int currentFloor;

	private final List<Integer> pool;

	public Controller(int currentFloor) {
		this.currentFloor = currentFloor;
		state = new IdleState();
		pool = new ArrayList<>();
	}

	public ElevatorState getState() {
		return state;
	}

	public void setState(ElevatorState state) {
		this.state = state;
	}

	public void request(int floor) {
		if (floor != currentFloor && !pool.contains(floor)) {
			pool.add(floor);
		}
		state.request(floor, this);
	}

	public void signal(int floor) {
		currentFloor = floor;
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
