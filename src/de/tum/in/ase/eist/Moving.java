package de.tum.in.ase.eist;

public class Moving extends ElevatorState {
    @Override
    public void request(int floor, Controller controller) {
        controller.getPool().add(floor);
    }

    @Override
    public void signal(int floor, Controller controller) {
        if (controller.getPool().get(0) == floor) {
            controller.setState(new stop());
            controller.getPool().remove(0);
        }
        // keep moving;
    }

    @Override
    public String getName() {
        return "Moving";
    }
}
