package de.tum.in.ase.eist;

public class Idle extends ElevatorState {
    @Override
    public void request(int floor, Controller controller) {
        controller.getPool().add(floor);
    }

    @Override
    public void signal(int floor, Controller controller) {
        controller.setState(new Moving());
    }

    @Override
    public String getName() {
        return "Idle";
    }
}
