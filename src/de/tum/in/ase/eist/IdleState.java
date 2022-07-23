package de.tum.in.ase.eist;

//TODO: actual state class extends state class
public class IdleState extends ElevatorState {


	@Override
	public void request(int floor, Controller controller) {
		if (floor != controller.getCurrentFloor()) {
			//	TODO: To switch the state of the context, create an instance of one of the state classes and pass it to the context.
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
