package de.tum.in.ase.eist;

public class Stop extends ElevatorState {
    @Override
    public void request(int floor, Controller controller) {
//        controller.getPool().add(floor);
//        controller.setState().
    }

    @Override
    public void signal(int floor, Controller controller) {
        if (controller.getPool().isEmpty()) {
            controller.setState(new Idle());
        } else {
            controller.setState(new Moving());
        }
    }
    @Override
    public String getName() {
        return "Stop";
    }
}
