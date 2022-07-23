package de.tum.in.ase.eist;

public class MovingState extends ElevatorState {

	@Override
	public void request(int floor, Controller controller) {
		// floor already added in Controller
		// we don't change the state
	}

	@Override
	public void signal(int floor, Controller controller) {
		if (floor == controller.getNextStop()) {
			controller.setState(new StopState());
		}
	}
	
	@Override
	public String getName() {
		return "MovingState";
	}
}
