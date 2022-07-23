package de.tum.in.ase.eist;

public class IdleState extends ElevatorState {

	@Override
	public void request(int floor, Controller controller) {
		if (floor != controller.getCurrentFloor()) {
			controller.setState(new MovingState());
		}
	}
	
	@Override
	public void signal(int floor, Controller controller) {
		//nothing to do (this should not happen)
	}
	
	@Override
	public String getName() {
		return "IdleState";
	}
}
