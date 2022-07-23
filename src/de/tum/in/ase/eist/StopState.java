package de.tum.in.ase.eist;

public class StopState extends ElevatorState {

	@Override
	public void request(int floor, Controller controller) {
		// nothing to do
	}

	@Override
	public void signal(int floor, Controller controller) {
		System.out.println("Elevator stopped in floor " + controller.getCurrentFloor());
		// remove the next stop because we now reached it
		controller.getPool().remove(0);
		if (controller.getPool().isEmpty()) {
			controller.setState(new IdleState());
		} else {
			controller.setState(new MovingState());
		}
	}

	@Override
	public String getName() {
		return "StopState";
	}
}
